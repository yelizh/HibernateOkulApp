package com.yeliz;

import com.yeliz.repository.entity.KisiselBilgiler;
import com.yeliz.repository.entity.Ogrenci;
import com.yeliz.repository.entity.Ogretmen;
import com.yeliz.repository.entity.Sinif;
import com.yeliz.repository.enums.EBrans;
import com.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session ss= HibernateUtility.getSessionFactory().openSession();
        Transaction tt= ss.beginTransaction();

    Ogretmen ogretmen= Ogretmen.builder()
            .kisiselBilgiler(KisiselBilgiler.builder()
                    .isim("Serap")
                    .soyisim("Kılınc")
                    .tcKimlikNo("01111111111")
                    .build())
            .brans(EBrans.KIMYA)
            .iseBaslamaTarihi(LocalDate.of(2020,10,10))
        .build();

        ss.save(ogretmen);

        Ogrenci ogrenci=Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Yeliz")
                        .soyisim("H.")
                        .tcKimlikNo("5202577777")
                        .build())
                .dTarihi(LocalDate.of(2023,7,5))
                .build();

        Ogrenci ogrenci1=Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Sevilay")
                        .soyisim("B.U.")
                        .tcKimlikNo("7777777777")
                        .build())
                .dTarihi(LocalDate.of(2023,7,5))
                .build();

        Ogrenci ogrenci2=Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("Merve")
                        .soyisim("B.")
                        .tcKimlikNo("777777777")
                        .build())
//                     .dTarihi(LocalDate.of(2023,7,5))
                .build();
        ss.save(ogrenci);
        ss.save(ogrenci1);
        ss.save(ogrenci2);

        Sinif sinif= Sinif.builder()
                .sinifAdi("Java11")
                .ogrenciler(Arrays.asList(ogrenci1.getKisiselBilgiler().getIsim()
                        ,ogrenci2.getKisiselBilgiler().getIsim()
                        ,ogrenci.getKisiselBilgiler().getIsim()))//ogrenci isimlerini getir
                .ogretmenId(ogretmen.getId())//ogretmenid al
                .build();

        ss.save(sinif);

    tt.commit();
    ss.close();

    }
}