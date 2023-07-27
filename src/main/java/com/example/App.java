package com.example;
public class App {
    public static void main(String[] args) {                                   // o main é uma função     -     as chaves delimitam uma função em java
        System.out.println();
        System.out.println();
        System.out.println("Minha aplicação Java\n");
        int idade = 10;                                                                                 //precisa atribuir um valor dessa variável antes de utilizar
        double peso = 80.5;                                                                         //precisa usar o double, pois preciso de número real
        System.out.println("Idade é " + idade + " Peso é " + peso);                                     //sysout é um atalho para chamar System.out.println
        char sexo = 'M';                                                                            // colocar 1 caracter somente. Seja Número ou Letra
        System.out.println("Sexo: " + sexo);
        boolean necessidadesEspeciais = false;                                                          //só aceita valores Verdadeiros e Falsos
        System.out.println("Tem necessidades especiais: " + necessidadesEspeciais);
    }
}
                                            //se eu colocar uma variável do tipo VAR, o java reconhece automaticamente o tipo da Variável