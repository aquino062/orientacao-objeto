import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcaoJogador, opcaoComputador;
        int scoreJogador = 0;
        int scoreComputador = 0;

        System.out.println("--------JoKenPo-------");
        System.out.println("1- Pedra");
        System.out.println("2- Papel");
        System.out.println("3- Tesoura");
        System.out.println("4 - Finalizar o programa");

        do {

            System.out.println("Digite a opção desejada:");
            opcaoJogador = scanner.nextInt();


            if (opcaoJogador < 1 || opcaoJogador > 4) {
                System.out.println("escolha somente de 1 a 3.");
                continue;
            }
            if (opcaoJogador == 4) {
                break;
            }

            switch (opcaoJogador) {
                case 1:
                    System.out.println("jogador escolheu Pedra");
                    break;
                case 2:
                    System.out.println("jogador escolheu Papel");
                    break;
                case 3:
                    System.out.println("jogador escolheu Tesoura");
                    break;
            }

            opcaoComputador = (int) (Math.random() * 3 + 1);
            switch (opcaoComputador) {
                case 1:
                    System.out.println("computador escolheu Pedra");
                    break;
                case 2:
                    System.out.println("computador escolheu Papel");
                    break;
                case 3:
                    System.out.println("computador escolheu Tesoura");
                    break;
            }

            if (opcaoJogador == opcaoComputador) {
                System.out.println("EMPATE");
                System.out.println("-----------------");
            } else {
                if (opcaoJogador == 1 && opcaoComputador == 3 || opcaoJogador == 2 && opcaoComputador == 1
                        || opcaoJogador == 3 && opcaoComputador == 2) {
                    System.out.println("JOGADOR VENCEU");
                    System.out.println("-----------------");
                    scoreJogador++;
                } else {
                    System.out.println("COMPUTADOR VENCEU");
                    System.out.println("-----------------");
                    scoreComputador++;
                }
            }
        } while (true);

        System.out.println("Score Jogador: " + scoreJogador);
        System.out.println("Score Computador: " + scoreComputador);
    }
}