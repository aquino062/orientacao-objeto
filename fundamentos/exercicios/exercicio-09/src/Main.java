import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lançamento do DADO");
        System.out.println("--------------------");
        char opcao = 'S';

        do{
            System.out.println("Deseja Lançar o DADO? S/N (SIM ou Não )");
            opcao = scanner.next().toUpperCase().charAt(0);
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("Face: "+ dado);
        }while(opcao == 'S');

    }
}