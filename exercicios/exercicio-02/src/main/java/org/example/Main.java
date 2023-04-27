package org.example;


public class Main {
    public static void main(String[] args) {


        contaCorrente pessoa = new contaCorrente("willian", 200,"923323");

       pessoa.alterarNome("pedro");
       pessoa.depositarDinheiro(550);
       pessoa.sacar(50);




       pessoa.imprimirDados();
    }
}