package com.dio.santander.bankline.api.model;

import com.dio.santander.bankline.api.enuns.EnumMovimentacaoTipo;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class MovimentacaoModel {
    private Integer id;
    private LocalDateTime dataHora;
    private String descricao;
    private Double valor;
    private EnumMovimentacaoTipo tipo;
}
