package com.example;

import java.time.LocalDate;

public class Cidadao {
    
    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public int idade(){                                          //Método /Não precisa de parâmetro porque vai ser informado no Atributo dataNascimento
        return LocalDate.now().getYear() - dataNascimento.getYear();              //Pegando a data atual       //data atual - ano da data de nascimento    //Com isso eu consigo saber a idade da pessoa
    }

    public String eleitor(){                                            //Eleitor ou Não
        int idade = idade();
        if(idade < 16)
            return "Não é eleitor";
        else if(idade > 15 && idade < 18 || idade > 70)
            return "Eleitor facultativo";
        
        else return "Eleitor obrigatório";

}

}
