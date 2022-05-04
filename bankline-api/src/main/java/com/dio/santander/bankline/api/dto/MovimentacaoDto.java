package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.entity.MovimentacaoEntity;
import com.dio.santander.bankline.api.enuns.EnumMovimentacaoTipo;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class MovimentacaoDto {
    private Integer id;
    private String descicao;
    private Double valor;
    private EnumMovimentacaoTipo tipo;
    private Integer contaId;

    public MovimentacaoDto(MovimentacaoEntity movimentacaoEntity) {
        this.id = movimentacaoEntity.getId();
        this.descicao = movimentacaoEntity.getDescricao();
        this.valor = movimentacaoEntity.getValor();
        this.tipo = movimentacaoEntity.getTipo();
        this.contaId = movimentacaoEntity.getContaId();
    }
}
