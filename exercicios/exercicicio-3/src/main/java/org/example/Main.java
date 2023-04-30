package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        bombaCombustivel b = new bombaCombustivel("gasolina", 5.50f, 100f);

        b.abastecerLitro(10);
        System.out.println(b.getQuantidadeCombustivel());


        b.alterarCombustivel("alcool");
        b.alterarQntdCombustivelBomba(500);
        b.alterarValor(6.00f);

        b.abastecerLitro(50);
        System.out.println(b.getQuantidadeCombustivel());
        b.abastecerValor(100);
        System.out.println(b.getQuantidadeCombustivel());


    }
}