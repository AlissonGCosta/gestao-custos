package br.com.javadeweek.gestao_custos.performance;

import br.com.javadeweek.gestao_custos.entity.Despesa;
import br.com.javadeweek.gestao_custos.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@Component
public class GestãoDeDespesaSeeder implements CommandLineRunner{


    @Autowired
    DespesaRepository despesaRepository;


    @Override
    public void run(String... args) throws Exception {
        List<Despesa> despesas = new ArrayList<>();
        System.out.println("Iniciando lista de despesas");

        for(int i = 0; i <= 150000; i++){
            Despesa despesa = new Despesa();
            despesa.setDescricao("Gasto n: " + i );
            despesa.setValor(BigDecimal.valueOf(10 + (i % 50)) );
            despesa.setData(LocalDate.now().minusDays(i % 30 ));
            despesa.setCategoria("teste");
            despesa.setEmail("teste@mail.com");

            despesas.add(despesa);
        }

        despesaRepository.saveAll(despesas);

        System.out.println("Terminando Lista de despesas");

    }

}
