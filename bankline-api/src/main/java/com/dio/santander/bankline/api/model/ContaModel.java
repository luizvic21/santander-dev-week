package com.dio.santander.bankline.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor

@Embeddable
public class ContaModel {

    @Column(name = "numero")
    private Long Numero;

    @Column(name = "saldo")
    private Double saldo;
}
