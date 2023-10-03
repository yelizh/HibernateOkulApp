package com.yeliz;


import com.yeliz.controller.OgrenciController;
import com.yeliz.controller.OgretmenController;
import com.yeliz.controller.SinifController;
import com.yeliz.repository.entity.KisiselBilgiler;
import com.yeliz.repository.entity.Ogrenci;
import com.yeliz.repository.entity.Ogretmen;
import com.yeliz.repository.entity.Sinif;
import com.yeliz.repository.enums.EBrans;

import java.time.LocalDate;
import java.util.List;

public class Main {
            public static void main(String[] args) {


                Ogrenci ogrenci = Ogrenci.builder()
                        .kisiselBilgiler(KisiselBilgiler.builder()
                                .isim("Ali")
                                .soyisim("Dogan")
                                .tcKimlikNo("1234789")
                                .build())
                        .dTarihi(LocalDate.of(1995,3,19))
                        .build();
               OgrenciController ogrenciController = new OgrenciController();
               ogrenciController.save(ogrenci);

                Ogretmen ogretmen=Ogretmen.builder()
                        .brans(EBrans.KIMYA)
                        .iseBaslamaTarihi(LocalDate.of(2020,10,2))
                        .kisiselBilgiler(KisiselBilgiler.builder()
                                .isim("Gaye")
                                .soyisim("Akyol")
                                .tcKimlikNo("819716")
                                .build())
                                .build();
                OgretmenController ogretmenController=new OgretmenController();
                ogretmenController.save(ogretmen);

                Sinif sinif=Sinif.builder()
                        .ogretmenId(ogretmen.getId())
                        .sinifAdi("Su")
                        .ogrenciler(List.of(ogrenci.getKisiselBilgiler().getIsim()))
                        .build();

                SinifController sinifController=new SinifController();
                sinifController.save(sinif);
            }
        }