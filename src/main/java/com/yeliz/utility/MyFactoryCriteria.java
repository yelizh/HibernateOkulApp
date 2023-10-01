package com.yeliz.utility;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

/**
 * Heryerde yazılması gereken kodların ortak dosyası
 */
public class MyFactoryCriteria<T,TUR> implements ICrud<T,TUR>{
    //sesiion aç,Trancaion oluştur
    private Session ss;
    private Transaction tt;
    private CriteriaBuilder criteriaBuilder;
    private EntityManager entityManager;
    T t;

    private void openSession(){
        ss=HibernateUtility.getSessionFactory().openSession();
        tt=ss.beginTransaction();
    }
    private  void closeSession(){
        tt.commit();
        ss.close();
    }

    public MyFactoryCriteria(T entity){
        entityManager=HibernateUtility.getSessionFactory().createEntityManager();
        criteriaBuilder=entityManager.getCriteriaBuilder();
        this.t=entity;
    }

    @Override
    public T save(T entity) {
        openSession();
        ss.save(entity);
        closeSession();
        return entity;
    }
    @Override
    public List<T> findAll() {
            CriteriaQuery<T> criteria= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
            Root<T> root= (Root<T>) criteria.from(t.getClass());
            criteria.select(root);
            List<T>bulunanList=entityManager.createQuery(criteria).getResultList();
            bulunanList.forEach(System.out::println);
            return bulunanList;
    }
    @Override
    public Optional<T> findById(TUR id) {
        CriteriaQuery<T> criteria = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T>root= (Root<T>) criteria.from(t.getClass());
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"),id));//id olnaları al
//        entityManager.createQuery(criteria).getSingleResult();
        T result=entityManager.createQuery(criteria).getSingleResult();
        System.out.println(result);
        return Optional.ofNullable(result);
    }





}


