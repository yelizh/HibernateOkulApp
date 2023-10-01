package com.yeliz.criteria;

import com.yeliz.utility.MyFactoryCriteria;
import com.yeliz.repository.entity.Ogrenci;

public class OgrenciCriteria extends MyFactoryCriteria<Ogrenci,Long> {

    public OgrenciCriteria() {
        super(new Ogrenci());
        //miras aldığı sınıfın constructorna Ogrencinin kendisini parametre olarak al
    }
}



