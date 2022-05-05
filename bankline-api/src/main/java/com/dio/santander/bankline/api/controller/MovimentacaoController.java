package com.dio.santander.bankline.api.controller;

import com.dio.santander.bankline.api.dto.MovimentacaoDto;
import com.dio.santander.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoService movimentacaoService;

    @GetMapping()
    public List<MovimentacaoDto> findAll() {
        return movimentacaoService.findAll().stream().map(MovimentacaoDto::new).collect(Collectors.toList());
    }

    @PostMapping()
    public void save(@RequestBody MovimentacaoDto movimentacaoDto) {
        movimentacaoService.save(movimentacaoDto);
    }

    @GetMapping("/{contaId}")
    public List<MovimentacaoDto> findByContaId(@PathVariable Integer contaId) {
        return movimentacaoService.findByContaId(contaId).stream().map(MovimentacaoDto::new).collect(Collectors.toList());
    }
}
