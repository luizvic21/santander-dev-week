package com.dio.santander.bankline.api.repository;

import com.dio.santander.bankline.api.entity.CorrentistaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<CorrentistaEntity, Integer> {
}
