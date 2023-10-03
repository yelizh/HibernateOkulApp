package com.yeliz.controller;
import com.yeliz.repository.OgrenciRepository;
import com.yeliz.repository.entity.Ogrenci;
import com.yeliz.service.OgrenciService;

import java.util.List;
import java.util.Optional;
public class OgrenciController {

    OgrenciService ogrenciService;

    public OgrenciController (){
        this.ogrenciService= new OgrenciService();
    }

    public Ogrenci save(Ogrenci ogrenci){
        return ogrenciService.save(ogrenci);
    }
    public Iterable<Ogrenci> saveAll(Iterable<Ogrenci> ogrenci){
        return ogrenciService.saveAll(ogrenci);

    }
    public void delete(Ogrenci ogrenci){
        ogrenciService.delete(ogrenci);
    }
    public void deleteById(Long id) {
        ogrenciService.deleteById(id);
    }
    public Optional<Ogrenci> findById(Long id) {
        return ogrenciService.findById(id);
    }
    public boolean existById(Long id) {
        return ogrenciService.existById(id);

    }
    public List<Ogrenci> findAll() {
        return ogrenciService.findAll();
    }
    public List<Ogrenci> findByColumnNameAndValue(String columnName, String value) {
        return ogrenciService.findByColumnNameAndValue(columnName, value);
    }

}

