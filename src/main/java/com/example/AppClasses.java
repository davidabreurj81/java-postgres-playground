package com.example;
public class AppClasses {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();                   //new está referenciando a Classe CLiente              //Cliente é um tipo, é um objeto
        cliente.setRenda(-10000);                //os parenteses não pode ficar vazio pq tem parâmetro dentro dele lá em cima. Diferente do get
        cliente.setSexo('M');                              // Obrigatório usar o set, pois a classe está privada
        cliente.setAnoNascimento(1980);
       
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());                   //é como se fosse uma pergunta: "É especial?"
        System.out.println();                             //colocado só para pular linha na hora de compilar
       
        Cliente cliente2 = new Cliente(2000, 'F');
        System.out.println();

        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Especial: " + cliente2.isEspecial());                   //é como se fosse uma pergunta: "É especial?"
    }
}