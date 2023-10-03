package com.yeliz.controller;

import com.yeliz.repository.entity.Ogrenci;
import com.yeliz.repository.entity.Ogretmen;
import com.yeliz.service.OgretmenService;

import java.util.List;
import java.util.Optional;

public class OgretmenController {

    OgretmenService ogretmenService;

    public OgretmenController() {
        this.ogretmenService=new OgretmenService();
    }
    public Ogretmen save(Ogretmen ogretmen){
        return ogretmenService.save(ogretmen);
    }
    public Iterable<Ogretmen> saveAll(Iterable<Ogretmen> ogretmen){
        return ogretmenService.saveAll(ogretmen);

    }
    public void delete(Ogretmen ogretmen){
        ogretmenService.delete(ogretmen);
    }
    public void deleteById(Long id) {
        ogretmenService.deleteById(id);
    }
    public Optional<Ogretmen> findById(Long id) {
        return ogretmenService.findById(id);
    }
    public boolean existById(Long id) {
        return ogretmenService.existById(id);

    }
    public List<Ogretmen> findAll() {
        return ogretmenService.findAll();
    }
    public List<Ogretmen> findByColumnNameAndValue(String columnName, String value) {
        return ogretmenService.findByColumnNameAndValue(columnName, value);
    }

}
