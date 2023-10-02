package com.yeliz.utility;

import java.util.List;
import java.util.Optional;

public interface ICrud <T>{

    T save(T entity);
    void update(T entity);
    List<T> findAll();
    Optional<T> findById(Long id);
}