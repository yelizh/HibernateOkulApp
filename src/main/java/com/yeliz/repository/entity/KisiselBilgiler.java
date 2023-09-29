package com.yeliz.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class KisiselBilgiler {

    @Column(nullable = false,length = 30)
    private String isim;

    @Column(nullable = false,length = 30)
    private String soyisim;

    @Column(nullable = false,unique = true,length = 11)
    private String tcKimlikNo;
}
