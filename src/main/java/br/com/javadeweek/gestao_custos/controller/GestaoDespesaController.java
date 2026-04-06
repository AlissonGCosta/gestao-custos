package br.com.javadeweek.gestao_custos.controller;



import br.com.javadeweek.gestao_custos.UseCases.BuscarDespesaUseCase;
import br.com.javadeweek.gestao_custos.UseCases.CadastroDespesaUseCase;
import br.com.javadeweek.gestao_custos.entity.Despesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.javadeweek.gestao_custos.custom_message.errorMessage;

import java.time.LocalDate;
import java.util.List;

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

    @Autowired
    BuscarDespesaUseCase buscarDespesaUseCase;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Despesa despesa){

        try{
           var restult =  cadastroDespesaUseCase.execute(despesa);
           return ResponseEntity.ok(restult);
        }catch(IllegalArgumentException e){
            var errorMessage = new errorMessage(e.getMessage(), "INVALID_PARAMETER");
            return ResponseEntity.status(400).body(errorMessage);
        }


    }

    @GetMapping("/{email}")
    public List<Despesa> FindByEmailAndDate(@PathVariable String email, @RequestParam(required = false) LocalDate data){
       return buscarDespesaUseCase.execute(email, data);
    }
}
