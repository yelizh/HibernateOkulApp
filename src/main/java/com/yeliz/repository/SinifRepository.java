package com.yeliz.repository;

import com.yeliz.repository.entity.Sinif;
import com.yeliz.utility.MyFactoryRepository;



public class SinifRepository extends MyFactoryRepository<Sinif,Long> {

    public SinifRepository(){
        super(new Sinif());
    }


}