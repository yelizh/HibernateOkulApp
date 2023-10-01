package com.yeliz.utility;

import java.util.List;
import java.util.Optional;

public interface ICrud<T,TUR> {
    //T generic değişkenim
    //TUR değişken türü; Long,string,float...T türü neyse esnek kullanım sağlar


    T save(T entity);
    List<T> findAll();
     Optional<T> findById(TUR id);

}
