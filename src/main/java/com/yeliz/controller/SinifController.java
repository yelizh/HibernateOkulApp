package com.yeliz.controller;

import com.yeliz.repository.entity.Ogretmen;
import com.yeliz.repository.entity.Sinif;
import com.yeliz.service.SinifService;

import java.util.List;
import java.util.Optional;

public class SinifController {

    SinifService sinifService;

    public SinifController() {
        this.sinifService = new SinifService();
    }
    public Sinif save(Sinif sinif){

        return sinifService.save(sinif);
    }
    public Iterable<Sinif> saveAll(Iterable<Sinif> sinif){
        return sinifService.saveAll(sinif);

    }
    public void delete(Sinif ogrenci){
        sinifService.delete(ogrenci);
    }
    public void deleteById(Long id) {
        sinifService.deleteById(id);
    }
    public Optional<Sinif> findById(Long id) {
        return sinifService.findById(id);
    }
    public boolean existById(Long id) {
        return sinifService.existById(id);

    }
    public List<Sinif> findAll() {
        return sinifService.findAll();
    }
    public List<Sinif> findByColumnNameAndValue(String columnName, String value) {
        return sinifService.findByColumnNameAndValue(columnName, value);
    }
}
