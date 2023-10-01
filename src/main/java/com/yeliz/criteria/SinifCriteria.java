package com.yeliz.criteria;


import com.yeliz.utility.MyFactoryCriteria;
import com.yeliz.repository.entity.Sinif;


public class SinifCriteria extends MyFactoryCriteria<Sinif,Long> {
    public SinifCriteria() {
        super(new Sinif());
        //miras aldığı sınıfın constructorna Sinifin kendisini parametre olarak al

    }

}
