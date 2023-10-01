package com.yeliz.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tbl_Ogrenci")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

//@NamedQueries({
//        @NamedQuery(name="Ogrenci.findByid",query = "SELECT id, dtarihi, isim, soyisim, tckimlikno
//	FROM tbl_ogrenci=:id;")
//})
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Embedded
    private KisiselBilgiler kisiselBilgiler;

//    @Column(nullable = false)
//    private LocalDate dTarihi;

    @Builder.Default
    @Column(nullable = false)
    private LocalDate dTarihi=LocalDate.now();

}
