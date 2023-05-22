import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        DecimalFormat formatador = new DecimalFormat("#0.00");
        Scanner scanner = new Scanner(System.in);

        double porcentagem;
        double valor = 0;

        System.out.println("Digite o valor:");
        valor = scanner.nextDouble();

        System.out.println("Digite o valor: (%) ");
        porcentagem = scanner.nextDouble();

        double calculo = (porcentagem * valor)/ 100;


        System.out.println(porcentagem+ "% de "+ valor + " = "+ formatador.format(calculo));
        }
    }
