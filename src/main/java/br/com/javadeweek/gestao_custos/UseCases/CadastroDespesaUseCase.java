package br.com.javadeweek.gestao_custos.UseCases;

import br.com.javadeweek.gestao_custos.entity.Despesa;
import br.com.javadeweek.gestao_custos.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroDespesaUseCase {

    @Autowired
    private DespesaRepository despesaRepository;

    public Despesa execute(Despesa despesa){

       despesa =  despesaRepository.save(despesa);
       return despesa;

    }

}
