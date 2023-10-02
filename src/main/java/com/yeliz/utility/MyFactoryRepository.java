package com.yeliz.utility;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class MyFactoryRepository <T> implements ICrud<T>{

    private Session session;
    private Transaction transaction;
    //    EntityManager entityManager = HibernateUtility.getSessionFactory().createEntityManager();
//    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
    T t;

    public MyFactoryRepository(T entity){
        this.t = entity;
    }
    private void openSession(){
        session = HibernateUtility.getSessionFactory().openSession();
        transaction = session.beginTransaction();
    }
    private void closeSession(){
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
    public void update(T entity) {
        openSession();
        session.update(entity);
        session.close();
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public Optional<T> findById(Long id) {
        return null;
    }
}
