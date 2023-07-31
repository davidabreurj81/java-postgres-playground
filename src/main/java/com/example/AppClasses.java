package com.example;

public class AppClasses {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();                   //new está referenciando a Classe CLiente              //Cliente é um tipo, é um objeto
        cliente.setRenda(-10000);                //os parenteses não pode ficar vazio pq tem parâmetro dentro dele lá em cima. Diferente do get
        cliente.setSexo('M');                              // Obrigatório usar o set, pois a classe está privada
        cliente.setAnoNascimento(1980);
        cliente.setNome("    Manoel    ");
        cliente.setCpf("99999999999");
        cliente.setCidade("Palmas");

        System.out.println("1º caracter do nome: " + cliente.getNome().charAt(0)); //charAt pega a letra do nome que vc especificar na posição entre parenteses
        System.out.println("Cidade: " + cliente.getCidade());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Especial: " + cliente.isEspecial());                   //é como se fosse uma pergunta: "É especial?"
        System.out.println();                                           //colocado só para pular linha na hora de compilar
       
        Cliente cliente2 = new Cliente(2000, 'F');
        cliente2.setNome("   Joana   ");
        cliente2.setCpf("99999999999");
        cliente2.setCidade("PALMAS");
        System.out.println();

        System.out.println("Cidade: " + cliente2.getCidade());
        System.out.println("CPF: " + cliente2.getCpf());
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
        System.out.println("Especial: " + cliente2.isEspecial());                   //é como se fosse uma pergunta: "É especial?"

            if (cliente.getCpf().equals(cliente2.getCpf()))                              //o "==" pega o endereço da memória. O "equals verifica o conteúdo".
                System.out.println("Cliente 1 e Cliente 2 tem o mesmo CPF");
                else System.out.println("CPFs são diferentes");

                if (cliente.getCidade().equalsIgnoreCase(cliente2.getCidade()))          //IgnoreCase é para ignorar letra minúscula de MAIÚSCULA. Se eu tirar, ele vai entender que eles moram em cidades diferentes          
                System.out.println("Cliente 1 e Cliente 2 moram na mesma cidade");
                else System.out.println("Cliente moram em cidades diferentes");




    }
}