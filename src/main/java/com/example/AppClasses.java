package com.example;
class Cliente {
    double renda;                  //isso é um Atributo. Não é uma Variável qualquer. Está fora do método "main"
    char sexo;
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    int anoNascimento;
    double getRenda(){              //isso é uma função. tem que pegar a varável determinada. no caso renda é double. o Get pega a renda
        return renda;               //retornar um valor para quem chamar o Método
    }
   void setRenda(double renda){         //passa o valor. renda dentro do parenteses é um Parâmetro. o Set altera a renda. Voide é vazio
        this.renda = renda;              // para difrenciar, coloca o this no objeto atual. O outro "renda" é o parâmetro
    }
}
public class AppClasses {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();                   //new está referenciando a Classe CLiente              //Cliente é um tipo, é um objeto
        cliente.setRenda(10000);                //os parenteses não pode ficar vazio pq tem parâmetro dentro dele lá em cima. Diferente do get
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);
       
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println();                             //colocado só para pular linha na hora de compilar
        Cliente cliente2 = new Cliente();
        cliente2.setRenda(2000);
        cliente2.setSexo('F');
        cliente2.setAnoNascimento(1970);
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAnoNascimento());
    }
}