import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotal, porcentagem, desconto, totalDesconto, valorPago;


        System.out.println("Sistema pdv do willian aquino");
        System.out.println("-----------------------------");

        System.out.println("Digite o valor total: ");
        valorTotal = scanner.nextDouble();

        System.out.println("Digite o desconto (%):");
        porcentagem = scanner.nextDouble();

        System.out.println("Valor pago:");
        valorPago = scanner.nextDouble();

        desconto = (valorTotal * porcentagem) / 100;
        totalDesconto = valorTotal - desconto;

        System.out.printf("Valor total da compra:R$ %.2f \n", valorTotal);
        System.out.println("Desconto: " + porcentagem + "%");
        System.out.printf("total com desconto: R$ %.2f \n", totalDesconto);
        System.out.printf("Valor pago: R$ %.2f \n", valorPago);
        System.out.printf("Troco: R$ %.2f", (valorPago - totalDesconto));
    }
}
