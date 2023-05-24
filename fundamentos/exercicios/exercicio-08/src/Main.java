import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
/*
        System.out.println("tabuada do willian aquino");

        System.out.println("Qual a Tabuada?");
        valor = scanner.nextInt();


        for (int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));

        }*/

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
                System.out.println( "-------------");
        }
    }
}