package com.yeliz.utility;

import com.yeliz.controller.OgrenciController;
import com.yeliz.repository.entity.KisiselBilgiler;
import com.yeliz.repository.entity.Ogrenci;

import java.time.LocalDate;

public class DataGenarator {

    OgrenciController ogrenciController;

    public DataGenarator() {
        this.ogrenciController=new OgrenciController();
    }

    public void ogrenciOlustur(){

        Ogrenci ogrenci = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Banu")
                        .soyisim("Yilmaz Yildiz")
                        .tcKimlikNo("25656201085")
                        .build())
                .dTarihi(LocalDate.of(1996,9,9))
                .build();
        OgrenciController ogrenciController = new OgrenciController();
        ogrenciController.save(ogrenci);

        Ogrenci ogrenci1 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Seviay")
                        .soyisim("Biçer Uçar")
                        .tcKimlikNo("44444444444")
                        .build())
                .dTarihi(LocalDate.of(1992,3,7))
                .build();
        ogrenciController.save(ogrenci1);

        Ogrenci ogrenci2 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Yeliz")
                        .soyisim("H.")
                        .tcKimlikNo("520257777")
                        .build())
                .dTarihi(LocalDate.of(1991,3,14))
                .build();
        ogrenciController.save(ogrenci2);


        Ogrenci ogrenci3 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Sedat")
                        .soyisim("Akdogan")
                        .tcKimlikNo("455545345345")
                        .build())
                .dTarihi(LocalDate.of(1997,5,19))
                .build();
        ogrenciController.save(ogrenci3);

        Ogrenci ogrenci4 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Veysel")
                        .soyisim("X_KRALTR_X")
                        .tcKimlikNo("99999999")
                        .build())
                .dTarihi(LocalDate.of(1999,3,12))
                .build();
        ogrenciController.save(ogrenci4);
        Ogrenci ogrenci5 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Mert")
                        .soyisim("Duman")
                        .tcKimlikNo("1234789")
                        .build())
                .dTarihi(LocalDate.of(1994,10,3))
                .build();
        ogrenciController.save(ogrenci5);

        Ogrenci ogrenci6 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Berke")
                        .soyisim("Shaco Main")
                        .tcKimlikNo("5555555555")
                        .build())
                .dTarihi(LocalDate.of(1997,6,26))
                .build();
        ogrenciController.save(ogrenci6);


        Ogrenci ogrenci7 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Zeynep")
                        .soyisim("Seckinli")
                        .tcKimlikNo("777")
                        .build())
                .dTarihi(LocalDate.of(1995,12,19))
                .build();

        ogrenciController.save(ogrenci7);
        Ogrenci ogrenci8 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Erdal")
                        .soyisim("Kömürcü")
                        .tcKimlikNo("23546988")
                        .build())
                .dTarihi(LocalDate.of(1972,7,20))
                .build();
        ogrenciController.save(ogrenci8);

        Ogrenci ogrenci9 = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Ugur")
                        .soyisim("Derin")
                        .tcKimlikNo("0177777701")
                        .build())
                .dTarihi(LocalDate.of(1994,6,16))
                .build();
        ogrenciController.update(ogrenci9);
    }

    public void ogretmenOlustur(){

    }

    public void sinifOlustur(){

    }
}

