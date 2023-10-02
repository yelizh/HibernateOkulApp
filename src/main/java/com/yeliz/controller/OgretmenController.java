package com.yeliz.controller;

import com.yeliz.repository.entity.Ogretmen;
import com.yeliz.service.OgretmenService;

public class OgretmenController {

    OgretmenService ogretmenService;

    public OgretmenController() {
        this.ogretmenService=new OgretmenService();
    }

    public Ogretmen save(Ogretmen ogretmen){
        return ogretmenService.save(ogretmen);
    }
}
