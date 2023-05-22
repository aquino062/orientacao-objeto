import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double alcool, gasolina;


        System.out.println("Álcool x Gasolina");
        System.out.println("------------------");
        System.out.println("Valor do alcool:");
        alcool = scanner.nextDouble();

        System.out.println("Valor da Gasolina:");
        gasolina = scanner.nextDouble();


        if(alcool < 0.7 * gasolina){

        System.out.println("o álcool é mais vantajoso");

        }else {

        System.out.println("a gasolina é mais vantajoso");
        }

        scanner.close();
        }

    }
