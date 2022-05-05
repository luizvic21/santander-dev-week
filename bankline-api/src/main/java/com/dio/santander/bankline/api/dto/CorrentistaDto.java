package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.entity.ContaEntity;
import com.dio.santander.bankline.api.entity.CorrentistaEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CorrentistaDto {

    private Integer id;
    private String nome;
    private String cpf;
    private ContaEntity conta;

    public CorrentistaDto(CorrentistaEntity correntistaEntity) {
        this.id = correntistaEntity.getId();
        this.nome = correntistaEntity.getNome();
        this.cpf = correntistaEntity.getCpf();
        this.conta = correntistaEntity.getConta();
    }
}
