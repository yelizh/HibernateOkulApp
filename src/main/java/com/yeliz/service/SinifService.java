package com.yeliz.service;

import com.yeliz.repository.SinifRepository;
import com.yeliz.repository.entity.Ogretmen;
import com.yeliz.repository.entity.Sinif;

import java.util.List;
import java.util.Optional;

public class SinifService {

    SinifRepository sinifRepository;

    public SinifService() {
        this.sinifRepository = new SinifRepository();
    }
    public Sinif save(Sinif sinif){

        return sinifRepository.save(sinif);
    }
    public Iterable<Sinif> saveAll(Iterable<Sinif> ogrenci){
        return sinifRepository.saveAll(ogrenci);

    }
    public void delete(Sinif ogrenci){
        sinifRepository.delete(ogrenci);
    }
    public void deleteById(Long id) {
        sinifRepository.deleteById(id);
    }
    public Optional<Sinif> findById(Long id) {
        return sinifRepository.findById(id);
    }
    public boolean existById(Long id) {
        return sinifRepository.existById(id);
    }
    public List<Sinif> findAll() {
        return sinifRepository.findAll();
    }
    public List<Sinif> findByColumnNameAndValue(String columnName, String value) {
        return sinifRepository.findByColumnNameAndValue(columnName, value);
    }


}
