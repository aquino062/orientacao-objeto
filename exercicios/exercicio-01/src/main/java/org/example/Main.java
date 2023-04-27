package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate dataNascimentoPessoa1 = LocalDate.of(1999, 1, 1);
        pessoa pessoa01 = new pessoa("willian Aquino", dataNascimentoPessoa1, 1.62f);

        LocalDate dataNacimentoPessoa2 = LocalDate.of(2002,2,25);
        pessoa pessoa2 = new pessoa("maik",dataNacimentoPessoa2,1.95f);

        pessoa01.impimirDados();
        System.out.println(pessoa01.calculaIdade() + " anos.\n");

        pessoa2.impimirDados();
        System.out.println(pessoa2.calculaIdade() + " anos.");
    }
}