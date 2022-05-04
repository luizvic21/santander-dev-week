package com.dio.santander.bankline.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Date;

@Getter

@Embeddable
public class ContaEntity {

    @Column(name = "conta_numero")
    private Long numero;

    @Column(name = "conta_saldo")
    private Double saldo;

    public ContaEntity() {
        this.numero = new Date().getTime();
        this.saldo = 0.0;
    }

    public void adicionarSaldo(Double valor) {
        this.saldo = this.saldo + valor;
    }
}
