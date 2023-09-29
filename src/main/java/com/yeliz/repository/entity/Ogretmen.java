package com.yeliz.repository.entity;

import com.yeliz.repository.enums.EBrans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tbl_ogretmen")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ogretmen {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Embedded
    private KisiselBilgiler kisiselBilgiler;

    @Enumerated(EnumType.STRING)
    private EBrans brans;

    //@Builder.Default
    @Column(nullable = false)
    private LocalDate iseBaslamaTarihi;//=LocalDate.now();

//    LocalDate iseBaslamaTarihi = LocalDate.now();



}
