import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double c, f;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Conversão de temperatura");
        System.out.println("Digite a temperatura em fahrenheit:");
        f = scanner.nextDouble();

        c = 5 * (f - 32) / 9;

        System.out.printf("A Temperatura em Celcius: %.2f° ", c);
        scanner.close();
    }
}