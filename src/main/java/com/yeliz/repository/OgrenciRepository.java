package com.yeliz.repository;

import  com.yeliz.repository.entity.Ogrenci;
import com.yeliz.utility.MyFactoryRepository;

public class OgrenciRepository extends MyFactoryRepository<Ogrenci,Long> {

    public OgrenciRepository() {

        super(new Ogrenci());
    }




}