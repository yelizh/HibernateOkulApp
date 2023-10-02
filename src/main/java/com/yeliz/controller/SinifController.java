package com.yeliz.controller;

import com.yeliz.repository.entity.Sinif;
import com.yeliz.service.SinifService;

public class SinifController {

    SinifService sinifService;

    public SinifController() {
        this.sinifService = new SinifService();
    }
    public Sinif save(Sinif sinif){
        return sinifService.save(sinif);
    }
}
