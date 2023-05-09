package org.example;


public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenarPessoa("João", 25, 1.80f);
        agenda.armazenarPessoa("Maria", 30, 1.70f);
        agenda.armazenarPessoa("Pedro", 40, 1.75f);

        agenda.imprimirAgenda(); // imprime todas as pessoas na agenda


        agenda.removerPessoa("João");

        agenda.imprimirAgenda(); // imprime todas as pessoas na agenda




    }
}
