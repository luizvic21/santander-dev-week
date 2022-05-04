package com.dio.santander.bankline.api.entity;

import com.dio.santander.bankline.api.dto.MovimentacaoDto;
import com.dio.santander.bankline.api.enuns.EnumMovimentacaoTipo;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor

@Entity
@Table(name = "movimentacao")
public class MovimentacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private Double valor;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private EnumMovimentacaoTipo tipo;

    @JoinColumn(name = "conta_id", referencedColumnName = "numero")
    private Integer contaId;

    public MovimentacaoEntity(MovimentacaoDto movimentacaoDto) {
        this.dataHora = LocalDateTime.now();
        this.descricao = movimentacaoDto.getDescicao();
        this.tipo = movimentacaoDto.getTipo();
        this.valor = this.tipo.equals(EnumMovimentacaoTipo.RECEITA) ? movimentacaoDto.getValor() : movimentacaoDto.getValor() * -1;
        this.contaId = movimentacaoDto.getContaId();
    }
}
