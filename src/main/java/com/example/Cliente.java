package com.example;

public class Cliente {                     //Colocar o public para a classe poder ser vista dentro de qualquer pacote
    private double renda;                 //O private e public são Modificadores de Visibilidade //isso é um Atributo. Não é uma Variável qualquer. Está fora do método "main"
    private char sexo;
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if( sexo == 'M' || sexo == 'F')     // O || significa OU
            this.sexo = sexo;
        else System.out.println("Sexo inválido");
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    private int anoNascimento;

    public double getRenda(){              //isso é uma função. tem que pegar a varável determinada. no caso renda é double. o Get pega a renda
        return renda;               //retornar um valor para quem chamar o Método
    }
   public void setRenda(double renda){         //passa o valor. renda dentro do parenteses é um Parâmetro. o Set altera a renda. Voide é vazio
        if(renda >= 0)                        //verificando SE tem números negativos ou NÂO
          this.renda = renda;              // para diferenciar, coloca o this no objeto atual. O outro "renda" é o parâmetro
        else System.out.println("A renda deve ser maior que zero");
    }
}