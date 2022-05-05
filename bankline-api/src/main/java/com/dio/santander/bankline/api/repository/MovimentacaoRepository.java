package com.dio.santander.bankline.api.repository;

import com.dio.santander.bankline.api.entity.MovimentacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovimentacaoRepository extends JpaRepository<MovimentacaoEntity, Integer> {

    List<MovimentacaoEntity> findByContaId(Integer contaId);
}
