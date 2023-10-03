package com.yeliz.utility;

import java.util.List;
import java.util.Optional;

public interface ICrud <T,ID>{

    T save(T entity);//geri dönüş tipi T kaydedilen id yi bana geri dön
   Iterable<T> saveAll(Iterable<T>entities);//itere edilebilir bir entity listesi ver
    void delete(T entity);
    void deleteById(ID id);
    Optional<T> findById(ID id);//olmayan bir id ile srorgulama yapılırsa hata almamak adına optinal ile dönülüyor nullcheck için
    boolean existById(ID id);//kaydın varlıgını sorgulama
    List<T>findAll();

    List<T>findByColumnNameAndValue(String columnName, String value);

}
