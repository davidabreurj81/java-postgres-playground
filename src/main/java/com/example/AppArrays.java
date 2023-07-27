package com.example;
import java.util.Arrays;
public class AppArrays {
    public static void main(String[] args) {                             //ao digitar só "main" ele completa pra vc
        int x = 10;
        System.out.println(x);
        double vetor[] = {10,20,30};                             // Para armazenar mais de 1 valor eu tenho que criar um Vetor. Os colchotes que dizem que essa variável é um Array, é um Vetor. O Vetor é como se fosse um conjunto na matemática. Por isso abre e fecha Chaves.
        System.out.println(Arrays.toString(vetor));      //imprimindo todos ao mesmo tempo      // o Arrays.toString é para converter em texto, pois não dá pra passar só o vetor dentro do System.out.println como nas variáveis comuns. 
        
        System.out.println("Valor da posição 0: " + vetor[0]);      //imprimindo um por um
        System.out.println("Valor da posição 1: " + vetor[1]);
        System.out.println("Valor da posição 2: " + vetor[2]);    
        
        vetor[0] = 1;                                               //alterando a ordem do vetor 0
        System.out.println("Valor da posição 0: " + vetor[0]);
        //outro exemplo:
        int vetor3[] = new int[4];                  //o número 4 indica quantos elementos eu quero no vetor
        vetor3[0] = 100;
        vetor3[1] = 200;
        vetor3[2] = 300;
        vetor3[3] = 400;
        System.out.println(Arrays.toString(vetor3));
        
        //Exemplo de Matriz
        
        double matriz[][] = { {10,20,30}, {40,50,60} };                           //Matriz é um conjunto de Vetores
        matriz[0][1] = -20;                                  //alterando a linha 0 na coluna 1
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
    }
}