package com.dio.santander.bankline.api.repository;

import com.dio.santander.bankline.api.entity.MovimentacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<MovimentacaoEntity, Integer> {
}
