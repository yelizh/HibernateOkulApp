package com.yeliz.service;

import com.yeliz.repository.SinifRepository;
import com.yeliz.repository.entity.Sinif;

public class SinifService {

    SinifRepository sinifRepository;

    public SinifService() {
        this.sinifRepository = new SinifRepository();
    }

    public Sinif save(Sinif sinif){
        return sinifRepository.save(sinif);
    }

}
