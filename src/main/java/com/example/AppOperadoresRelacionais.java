package com.example;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1 = new Cliente();                       //uma forma de instanciar a classe Cliente.     //var substitui o Tipo (Variável) que seria "Cliente". "cliente1" é o nome da variável, ou seja, cliente1 é da CLASSE Cliente
        cliente1.setAnoNascimento(1980);

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(1980);

       // if(cliente1.getAnoNascimento() == cliente2.getAnoNascimento()){
          //  System.out.println("Os clientes nasceram no mesmo ano");
            //System.out.println("Os anos de nascimento dos clientes são: " + cliente1.getAnoNascimento());

       // } else {                                                                                               //Se tiver mais de uma instrução no else tem que colocar chaves   
            //System.out.println("Os clientes nasceram em anos diferentes");
            //System.out.println("O ano de nascimento do cliente 1 é: " + cliente1.getAnoNascimento());
           // System.out.println("O ano de nascimento do cliente 2 é: " + cliente2.getAnoNascimento());
      //  }

        //outro exemplo

        if(cliente1.getAnoNascimento() > cliente2.getAnoNascimento()){
            System.out.println("Cliente 1 é mais jovem que o Cliente 2");
        }
    
        else if(cliente1.getAnoNascimento() < cliente2.getAnoNascimento()){
            System.out.println("O cliente 1 é mais velho que o cliente 2");
    }
        else System.out.println("Os cliente tem a mesma idade");


}
}
