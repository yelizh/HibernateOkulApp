package com.yeliz.criteria;

import com.yeliz.utility.MyFactoryCriteria;
import com.yeliz.repository.entity.Ogretmen;

public class OgretmenCriteria extends MyFactoryCriteria<Ogretmen,Long> {

    public OgretmenCriteria() {
        super(new Ogretmen());
        //miras aldığı sınıfın constructorna Ogretmenin kendisini parametre olarak al
    }
}
