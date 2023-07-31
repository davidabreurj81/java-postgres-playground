package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {                             //ao digitar só "main" ele completa pra vc

       int vetor3[] = new int [5];
        for (int i = 0; i < vetor3.length; i++){                    //enquanto o i for menor que o tamanho do Vetor, que é o "length" ele vai incrementar o i
            vetor3 [i] = 100 * (i+1);                               //100 * i seria 100*0, então tem que somar com +1. E colocar entre parenteses para somar primeiro antes de multiplicar
        }
        System.out.println(Arrays.toString(vetor3));
        System.out.println();

        
        //Exemplo de Matriz
        
        double matriz[][] = new double [2][3];                           //Matriz é um conjunto de Vetores //2 linhas e 3 colunas
        for (int i = 0; i < matriz.length; i++) {                        //length vai pegar o total de linhas da Matriz
            for (int j = 0; j < matriz[i].length; j++) {                 //o i na Matriz foi para percorrer a linha i acima. Pra cada linha i percorrida eu vou percorre a coluna j
                matriz[i][j] = i * matriz[i].length + j;           //linha i e coluna j. //o número dessa linha + número da coluna atual
                
            }
            
        }


        for (int i = 0; i < matriz.length; i++) {                        
            for (int j = 0; j < matriz[i].length; j++) {                
               System.out.print(matriz[i][j] + " ");                 //esse sysout não pode ser com "ln" senão vai imprimir a Matriz inteira como se fosse uma única coluna
                
            }
            System.out.println();
            
        }

    }
}