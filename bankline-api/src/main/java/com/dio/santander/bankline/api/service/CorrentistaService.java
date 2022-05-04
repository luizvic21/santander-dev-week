package com.dio.santander.bankline.api.service;

import com.dio.santander.bankline.api.dto.CorrentistaDto;
import com.dio.santander.bankline.api.entity.CorrentistaEntity;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorrentistaService {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(CorrentistaDto correntistaDto) {
        CorrentistaEntity correntistaEntity = new CorrentistaEntity(correntistaDto);

        correntistaRepository.save(correntistaEntity);
    }

    public List<CorrentistaEntity> findAll() {
        return correntistaRepository.findAll();
    }

    public CorrentistaEntity findById(Integer id) {
        return correntistaRepository.findById(id).orElseThrow(() -> new RuntimeException("Correntista "  + id + " não existe"));
    }

    public void alterarSaldo(Integer id, Double valor) {
        CorrentistaEntity correntistaEntity = this.findById(id);
        correntistaEntity.alterarContaSaldo(valor);

        this.correntistaRepository.save(correntistaEntity);
    }

}
