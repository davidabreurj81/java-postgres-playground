package com.example;

import java.util.ArrayList;
import java.util.List;

public class AppListas {

    public static void main(String[] args) {
        Cliente[] vetorCliente = new Cliente [5];          //Vetor       
        List <Cliente> listaClientes = new ArrayList<>();                                 //Lista  //Com < > eu digo quais são os elemtnos da minha lista. Se eu botar [] vira Vetor. //ArraysList<> usa um vetor para armazenar os dados
                                                                //Quando instancia uma ArrayList ele cria um vetor de capacidade de 10 elementos
        var cliente1 = new Cliente();
        cliente1.setNome("Manoel");
        cliente1.setCidade("Palmas");

      
        var cliente2 = new Cliente();
        cliente2.setNome("Breno");
        cliente2.setCidade("Araguaiana");

        listaClientes.add(cliente1);
        listaClientes.add(cliente1); 
        listaClientes.add(cliente1); 
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente1); 
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);

        listaClientes.remove(0);                              //remover clientes da posição 0
        listaClientes.remove(0);
        listaClientes.remove(0);

        for (Cliente cliente : listaClientes) {                     //loop. Percorrer cliente por cliente, imprimindo de 1 a 1
            System.out.println(cliente);
        }

    }
}