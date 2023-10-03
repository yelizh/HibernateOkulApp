package com.yeliz.service;

import com.yeliz.repository.OgretmenRepository;
import com.yeliz.repository.entity.Ogrenci;
import com.yeliz.repository.entity.Ogretmen;

import java.util.List;
import java.util.Optional;

public class OgretmenService {

   OgretmenRepository ogretmenRepository;

    public OgretmenService() {

        this.ogretmenRepository=new OgretmenRepository();
    }

    public Ogretmen save(Ogretmen ogretmen){
        return ogretmenRepository.save(ogretmen);
    }
    public Iterable<Ogretmen> saveAll(Iterable<Ogretmen> ogretmen){
        return ogretmenRepository.saveAll(ogretmen);

    }
    public void delete(Ogretmen ogretmen){
        ogretmenRepository.delete(ogretmen);
    }
    public void deleteById(Long id) {
        ogretmenRepository.deleteById(id);
    }
    public Optional<Ogretmen> findById(Long id) {
        return ogretmenRepository.findById(id);
    }
    public boolean existById(Long id) {
        return ogretmenRepository.existById(id);

    }
    public List<Ogretmen> findAll() {
        return ogretmenRepository.findAll();
    }
    public List<Ogretmen> findByColumnNameAndValue(String columnName, String value) {
        return ogretmenRepository.findByColumnNameAndValue(columnName, value);
    }


}
