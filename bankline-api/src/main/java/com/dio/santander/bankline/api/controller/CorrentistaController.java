package com.dio.santander.bankline.api.controller;

import com.dio.santander.bankline.api.dto.CorrentistaDto;
import com.dio.santander.bankline.api.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaService correntistaService;

    @GetMapping()
    public List<CorrentistaDto> findAll() {
        return correntistaService.findAll().stream().map(CorrentistaDto::new).collect(Collectors.toList());
    }

    @PostMapping()
    public void save(@RequestBody CorrentistaDto correntistaDto) {
        correntistaService.save(correntistaDto);
    }
}
