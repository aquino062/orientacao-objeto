import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double remuneracaoMensal, imposto, custoOperacional, investimentos,cargaHoraria,hora;

        System.out.println("Calculadora do valor da hora de serviço");

        System.out.println("Remuneração mensal pretendida:");
        remuneracaoMensal = scanner.nextDouble();

        System.out.println("custo operacional mensal:");
        custoOperacional = scanner.nextDouble();

        System.out.println("carga horaria mensal de trabalho:");
        cargaHoraria = scanner.nextDouble();

        imposto = remuneracaoMensal * 0.3;
        investimentos = remuneracaoMensal * 0.2;

         hora = (remuneracaoMensal + imposto + custoOperacional+ investimentos) / cargaHoraria ;

        System.out.printf("valor da hora: %.2f ", hora);
        scanner.close();
    }
}