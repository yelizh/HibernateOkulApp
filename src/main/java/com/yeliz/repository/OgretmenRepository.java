package com.yeliz.repository;


import com.yeliz.repository.entity.Ogretmen;
import com.yeliz.utility.MyFactoryRepository;




public class OgretmenRepository extends MyFactoryRepository<Ogretmen,Long> {
    public OgretmenRepository() {

        super(new Ogretmen());
    }

}

