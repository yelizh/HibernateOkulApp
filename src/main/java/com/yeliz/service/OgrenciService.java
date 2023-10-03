package com.yeliz.service;

import com.yeliz.repository.OgrenciRepository;
import com.yeliz.repository.entity.Ogrenci;

import java.util.List;
import java.util.Optional;
public class OgrenciService {

    OgrenciRepository ogrenciRepository;

    public OgrenciService (){
      this.ogrenciRepository= new OgrenciRepository();
    }

    public Ogrenci save(Ogrenci ogrenci){
        return ogrenciRepository.save(ogrenci);
    }
    public Iterable<Ogrenci> saveAll(Iterable<Ogrenci> ogrenci){
        return ogrenciRepository.saveAll(ogrenci);

    }
    public void delete(Ogrenci ogrenci){
        ogrenciRepository.delete(ogrenci);
    }
    public void deleteById(Long id) {
        ogrenciRepository.deleteById(id);
    }
    public Optional<Ogrenci> findById(Long id) {
        return ogrenciRepository.findById(id);
    }
    public boolean existById(Long id) {
        return ogrenciRepository.existById(id);

    }
    public List<Ogrenci> findAll() {
        return ogrenciRepository.findAll();
    }
    public List<Ogrenci> findByColumnNameAndValue(String columnName, String value) {
    return ogrenciRepository.findByColumnNameAndValue(columnName, value);
    }


}


