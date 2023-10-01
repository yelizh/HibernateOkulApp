package com.yeliz.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tbl_Sinif")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sinif {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    private String sinifAdi;


    private Long ogretmenId;

    @ElementCollection
    private List<String>ogrenciler;
}
