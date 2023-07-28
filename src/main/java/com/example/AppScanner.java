package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();                   //new está referenciando a Classe Cliente              //Cliente é um tipo, é um objeto
        Scanner scanner = new Scanner(System.in);                //Tipo e variável //Scanner está em outro pacote diferente do src/main/java/com/example, com isso temos que importar lá em cima
                                                                 //instanciar tem que ser "new e o nome da classe" 
                                                                 //System.in é para eu escanear pelo teclado. É a entrada padrão pelo teclado
        System.out.println("Digite o nome: ");
        cliente.setNome (scanner.nextLine());                              //Capturar o que o usuário digitar //Line só retorna String

        System.out.println("Digite a renda: ");
        cliente.setRenda (scanner.nextDouble());                           //Usamos o Double porque o método é do tipo Double

        scanner.nextLine();                                               //Ele vai pegar o "Enter" que digitei anteriormente e vai descartar. Se o dado anterior fosse uma "String" eu não precisaria do "scanner.nextLine()"
        System.out.println("Digite o CPF: ");
        cliente.setCpf (scanner.nextLine());

        System.out.println("Digite a cidade: ");
        cliente.setCidade (scanner.nextLine());

        System.out.println("Digite o ano de nascimento: ");
        cliente.setAnoNascimento (scanner.nextInt());                     //Usamos o Double porque o método é do tipo Double

        scanner.nextLine();                                               //Ele vai pegar o "Enter" que digitei anteriormente e vai descartar. Se o dado anterior fosse uma "String" eu não precisaria do "scanner.nextLine()"
        System.out.println("Digite o sexo: ");  
        String sexo = scanner.nextLine();                          
        cliente.setSexo (sexo.charAt(0));                            //Sexo é char, mas não existe nextChar. Usamos o "charAt" para pegar a primeira letra.


       
        System.out.println("Cidade: " + cliente.getCidade());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());                   //é como se fosse uma pergunta: "É especial?"


        

    }
}