package com.dio.santander.bankline.api.entity;

import com.dio.santander.bankline.api.dto.CorrentistaDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor

@Entity
@Table(name = "correntista")
public class CorrentistaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "nome")
    private String nome;

    @Embedded
    private ContaEntity conta;

    public CorrentistaEntity(CorrentistaDto correntistaDto) {
        this.cpf = correntistaDto.getCpf();
        this.nome = correntistaDto.getNome();
        this.conta = new ContaEntity();
    }

    public void alterarContaSaldo(Double valor) {
        this.conta.adicionarSaldo(valor);
    }
}
