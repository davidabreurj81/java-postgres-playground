package com.example;

public class AppOpLogicos {
    boolean a(boolean valor){
        System.out.println("a");
        return valor;
    }
    boolean b(boolean valor){                                   //Métodos a, b, c
        System.out.println("b");
        return valor;
    }
     boolean c(boolean valor){
        System.out.println("c");
        return valor;
    }

    AppOpLogicos(){                                                                    //Construtor tem que ter o nome da Classe sem um Retorno
        System.out.println(a(true) || b(false) && c(true));                 //todo Método para ser chamado tem que colocar ()       //&& sempre será feito primeiro do que o ||
                                                                            //Parâmetro são valores a serem informados ao Método para ele poder executar 

    }


    public static void main(String[] args) {                        //Instanciar é criar um objeto chamando um de seus Construtores
        new AppOpLogicos();                      //new + o nome do Construtor (estou criando um objeto da Classe AppOpLogicos)
       
                                                               
    }
}
