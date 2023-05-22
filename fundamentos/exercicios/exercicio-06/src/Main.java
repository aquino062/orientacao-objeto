import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Calculo do IMC ");
        System.out.println("Digite o peso:");
        peso = scanner.nextFloat();

        System.out.println("Digite a altura:");
        altura = scanner.nextFloat();

        imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f \n", imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 35) {
            System.out.println("Obsidade grau | ");
        } else if (imc < 40) {
            System.out.println("Obsidade grau || (severa)");
        } else {
            System.out.println("Obsidade grau ||| (mórbida)");
        }

    }
}