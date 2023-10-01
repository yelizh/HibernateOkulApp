package com.yeliz;

import com.yeliz.criteria.OgrenciCriteria;
import com.yeliz.criteria.OgretmenCriteria;
import com.yeliz.criteria.SinifCriteria;
import com.yeliz.repository.entity.KisiselBilgiler;
import com.yeliz.repository.entity.Ogrenci;
import com.yeliz.repository.entity.Ogretmen;
import com.yeliz.repository.entity.Sinif;
import com.yeliz.repository.enums.EBrans;

import java.time.LocalDate;
import java.util.Arrays;

public class MainCriteriaQuery {
    public static void main(String[] args) {

        OgrenciCriteria ogrenciCriteria=new OgrenciCriteria();
        OgretmenCriteria ogretmenCriteria=new OgretmenCriteria();
        SinifCriteria sinifCriteria=new SinifCriteria();

        Ogrenci o1=ogrenciCriteria.save(Ogrenci.builder()
                        .dTarihi(LocalDate.of(2010,3,7))
                        .kisiselBilgiler(KisiselBilgiler.builder()
                                .isim("Sevilay")
                                .soyisim("B.U.")
                                .tcKimlikNo("777777777")
                                .build())
                    .build());

        Ogrenci o2=ogrenciCriteria.save(Ogrenci.builder()
                        .dTarihi(LocalDate.of(2010,4,8))
                        .kisiselBilgiler(KisiselBilgiler.builder()
                                .isim("Merve")
                                .soyisim("B")
                                .tcKimlikNo("7777777770")
                                .build())
                        .build());


        Ogretmen ogretmen1=ogretmenCriteria.save(Ogretmen.builder()
                        .brans(EBrans.KIMYA)
                        .iseBaslamaTarihi(LocalDate.of(2020,10,10))
                        .kisiselBilgiler(KisiselBilgiler.builder()
                                .isim("Serap")
                                .soyisim("K")
                                .tcKimlikNo("520257777")
                                .build())
                        .build());

        Sinif sinif=sinifCriteria.save(Sinif.builder()
                        .sinifAdi("11A")
                        .ogrenciler(Arrays.asList(o1.getKisiselBilgiler().getIsim(),o2.getKisiselBilgiler().getIsim()))
                        .ogretmenId(ogretmen1.getId())
                    .build());


        ogrenciCriteria.findAll();
        ogretmenCriteria.findAll();
        sinifCriteria.findAll();

        ogrenciCriteria.findById(2L);
        ogretmenCriteria.findById(1L);
        sinifCriteria.findById(1L);


    }
}
