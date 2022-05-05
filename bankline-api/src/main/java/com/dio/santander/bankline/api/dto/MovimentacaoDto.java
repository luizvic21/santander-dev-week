package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.entity.MovimentacaoEntity;
import com.dio.santander.bankline.api.enuns.EnumMovimentacaoTipo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
public class MovimentacaoDto {
    private Integer id;
    private String descricao;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataHora;
    private Double valor;
    private EnumMovimentacaoTipo tipo;
    private Integer contaId;

    public MovimentacaoDto(MovimentacaoEntity movimentacaoEntity) {
        this.id = movimentacaoEntity.getId();
        this.descricao = movimentacaoEntity.getDescricao();
        this.dataHora = movimentacaoEntity.getDataHora();
        this.valor = movimentacaoEntity.getValor();
        this.tipo = movimentacaoEntity.getTipo();
        this.contaId = movimentacaoEntity.getContaId();
    }
}
