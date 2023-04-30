package org.example;


public class Main {
    public static void main(String[] args) {

        Elevador e = new Elevador(0,10,5,0);

        e.entra(2);
        e.sobe(2);

        System.out.println(e.andarAtual);
        e.sobe(8);
        System.out.println(e.andarAtual);

        System.out.println(e.getPessoasNoElevador());
        e.entra(6);
        System.out.println(e.getPessoasNoElevador());


    }
}