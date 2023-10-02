package com.yeliz.controller;
import com.yeliz.repository.entity.Ogrenci;
import com.yeliz.service.OgrenciService;

import java.util.List;
import java.util.Optional;
public class OgrenciController {

    OgrenciService ogrenciService;

    public OgrenciController (){

        this.ogrenciService = new OgrenciService();
    }

    public Ogrenci save(Ogrenci ogrenci){

        return ogrenciService.save(ogrenci);
    }

    public void update(Ogrenci ogrenci){

        ogrenciService.update(ogrenci);
    }

    public List<Ogrenci> findAll(){
        return ogrenciService.findAll();
    }

    public Optional<Ogrenci> findById(Long id){

        return ogrenciService.findById(id);
    }
}

