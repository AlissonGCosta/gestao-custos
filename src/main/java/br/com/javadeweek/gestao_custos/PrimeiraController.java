package br.com.javadeweek.gestao_custos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/javadevweek")
@RestController

public class PrimeiraController {

    @GetMapping("/helloworld")
    public String helloWord(){
        return "Ola mundo!, primeira aula do mundo!!";
    }
}
