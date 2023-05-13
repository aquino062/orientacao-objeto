package org.example;


public class Main {
    public static void main(String[] args) {

        Carro fusca = new Carro("fusca ", 0);

        fusca.abastercerCarro(20);
        fusca.moverCarro(200);

        System.out.println("Disponivel no tanque:" + fusca.getTanqueCombustivel() + " Litro(s)");

        fusca.abastercerCarro(52);
        fusca.moverCarro(200);


    }
}