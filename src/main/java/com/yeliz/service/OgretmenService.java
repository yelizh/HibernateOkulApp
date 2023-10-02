package com.yeliz.service;

import com.yeliz.repository.OgretmenRepository;
import com.yeliz.repository.entity.Ogretmen;

public class OgretmenService {

   OgretmenRepository ogretmenRepository;

    public OgretmenService() {
        this.ogretmenRepository=new OgretmenRepository();
    }

    public Ogretmen save(Ogretmen ogretmen){
        return ogretmenRepository.save(ogretmen);
    }
}
