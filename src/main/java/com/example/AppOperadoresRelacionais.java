package com.example;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        
        var cliente1 = new Cliente();                       //uma forma de instanciar a classe Cliente.     //var substitui o Tipo (Variável) que seria "Cliente". "cliente1" é o nome da variável, ou seja, cliente1 é da CLASSE Cliente
        cliente1.setAnoNascimento(1980);

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(1980);

        boolean cliente1MaisJovem = cliente1.getAnoNascimento() > cliente2.getAnoNascimento();
        boolean cliente1MaisVelho = cliente1.getAnoNascimento() < cliente2.getAnoNascimento();

        if(cliente1MaisJovem){
            System.out.println("Cliente 1 é mais jovem que o Cliente 2");
        }
    
        else if(cliente1MaisVelho){
            System.out.println("O cliente 1 é mais velho que o cliente 2");
    }
        else System.out.println("Os cliente tem a mesma idade");

}
}
