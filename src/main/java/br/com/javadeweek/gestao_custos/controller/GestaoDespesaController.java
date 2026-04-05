package br.com.javadeweek.gestao_custos.controller;


import br.com.javadeweek.gestao_custos.UseCases.CadastroDespesaUseCase;
import br.com.javadeweek.gestao_custos.entity.Despesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/gestao")
@RestController
public class GestaoDespesaController {

    /*
    * - cadastro de despesa
    * - Criar tabela no banco de dados
    * - criar entidade
     */
    @Autowired
    CadastroDespesaUseCase cadastroDespesaUseCase;

    @PostMapping("/create")
    public Despesa create(@RequestBody Despesa despesa){

        return cadastroDespesaUseCase.execute(despesa);

    }
}
