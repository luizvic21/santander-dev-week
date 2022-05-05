package com.dio.santander.bankline.api.service;

import com.dio.santander.bankline.api.dto.MovimentacaoDto;
import com.dio.santander.bankline.api.entity.CorrentistaEntity;
import com.dio.santander.bankline.api.entity.MovimentacaoEntity;
import com.dio.santander.bankline.api.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Autowired
    private CorrentistaService correntistaService;

    public void save(MovimentacaoDto movimentacaoDto) {
        CorrentistaEntity correntistaEntity = correntistaService.findById(movimentacaoDto.getContaId());
        MovimentacaoEntity movimentacaoEntity = new MovimentacaoEntity(movimentacaoDto);
        correntistaService.alterarSaldo(correntistaEntity.getId(), movimentacaoEntity.getValor());

        movimentacaoRepository.save(movimentacaoEntity);
    }

    public List<MovimentacaoEntity> findAll() {
        return movimentacaoRepository.findAll();
    }

    public List<MovimentacaoEntity> findByContaId(Integer contaId) {
        return movimentacaoRepository.findByContaId(contaId);
    }

}
