package com.example;

public class Cliente {                     //Colocar o public para a classe poder ser vista dentro de qualquer pacote
    private double renda;                 //O private e public são Modificadores de Visibilidade //isso é um Atributo. Não é uma Variável qualquer. Está fora do método "main"
    private char sexo;
    private boolean especial;               //para definir se o cliente é especial ou não


    public Cliente(){                                  //se não retornasse nada era public void    //Construtor do "new Cliente" na outra aba   //este exemplo está no clinte na outra aba
        System.out.println("Criando um cliente usando o construtor sem parâmetro");
        double aleatorio = Math.random();                                            //Gera um número aleatório entre 0 e 1
        if(aleatorio > 0.5)                                                         //50% de ser especial ou não
            especial = true;
    }     
  
    // duas maneiras diferentes de instanciar um Cliente

    public Cliente(double renda, char sexo){                                  //separando os parâmetros por vírgula,  //este exemplo está no clinte2 na outra aba
        this();                                                                     //Pra eu fazer um Construtor chamar outro (o de cima) eu tenho que colocar na 1ª linha. O Construtor que eu chamar 1º, vai ser ele quem vai carregar o Objeto
        System.out.println("Criando um cliente usando o construtor com parâmetro");
        setRenda(renda);
        this.renda = renda;
        this.sexo = sexo;
    }     

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

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
        else System.out.println("A renda deve ser maior ou igual a zero");
    }
}