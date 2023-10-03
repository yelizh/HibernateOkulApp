package com.yeliz.utility;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


//genel Repository
public class MyFactoryRepository<T,ID> implements ICrud<T,ID> {//ID içeri turu ver demek

    private Session session;
    private Transaction transaction;

    private CriteriaBuilder criteriaBuilder;
    private EntityManager entityManager;

    T t;//deleteById metodumda nesne ihtiyacm oldgndan tanımladım

    public MyFactoryRepository(T entity) {//constructorında, criteria oluşturmak için başlatıyoruz
        entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        criteriaBuilder = entityManager.getCriteriaBuilder();
        this.t = entity;//cons tanmladk
    }

    private void openSession() {
        session = HibernateUtility.getSessionFactory().openSession();
        transaction = session.beginTransaction();
    }

    private void closeSession() {
        transaction.commit();
        session.close();
    }

    @Override
    public T save(T entity) {
        openSession();
        session.save(entity);
        closeSession();
        return entity;
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> entities) {
        openSession();
        entities.forEach(t -> {
            session.save(t);
        });
        closeSession();
        return entities;
    }

    @Override
    public void delete(T entity) {
        openSession();
        session.delete(entity);
        closeSession();
    }

    @Override
    public void deleteById(ID id) {//idsini bulup sil
        CriteriaQuery<T> criteria = (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());//geneeric type oldgndan cast edildi
        Root<T> root = (Root<T>) criteria.from(t.getClass());
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"), id));
        T result = entityManager.createQuery(criteria).getSingleResult();
        openSession();
        session.delete(result);
        closeSession();
    }

    @Override
    public Optional<T> findById(ID id) { //Optinalda Null check yapmak için, kontrol ediliyor.
        CriteriaQuery<T>criteria= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T>root= (Root<T>) criteria.from(t.getClass());
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"),id));
        T result=entityManager.createQuery(criteria).getSingleResult();
        return Optional.ofNullable(result);


    }

    @Override
    public boolean existById(ID id) {
        CriteriaQuery<T>criteria= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T>root= (Root<T>) criteria.from(t.getClass());
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"),id));
        T result=entityManager.createQuery(criteria).getSingleResult();
        return result!=null;//Eğer kayıt (null değil ise)=>true
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T>criteria= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T>root= (Root<T>) criteria.from(t.getClass());
        criteria.select(root);
        return entityManager.createQuery(criteria).getResultList();
    }

    /**
     *
     *  select*from tbl_where column =value
     * @param columnName
     * @param value- % ve _ karakteri kullanıcılar tarafından işlenir.
     * @return
     */
    @Override
    public List<T> findByColumnNameAndValue(String columnName, String value) {
    //Aranan kolon ve value değeri kullanıcıdan alınacak
        CriteriaQuery<T>criteria= (CriteriaQuery<T>) criteriaBuilder.createQuery(t.getClass());
        Root<T>root= (Root<T>) criteria.from(t.getClass());
        criteria.select(root);
        //Aranılan kolon
        criteria.where(criteriaBuilder.equal(root.get(columnName),value));
        criteria.where(criteriaBuilder.like(root.get(columnName),value));//kullanıcının girdiği kolon adı ve değer eşitliği konrtolü
        return entityManager.createQuery(criteria).getResultList();
    }




}


