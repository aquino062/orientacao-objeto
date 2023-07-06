import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int opcao;

        // Cria um objeto da classe Cofrinho
        Cofrinho cofrinho = new Cofrinho();

        // Menu de opções
        System.out.println("COFRINHO:");
        System.out.println("1- Adicionar moedas:");
        System.out.println("2- Remover moedas:");
        System.out.println("3- Listar moedas:");
        System.out.println("4- Calcular valor total convertido para real:");
        System.out.println("0- Encerrar");
        opcao = scanner.nextInt();


        Moeda moeda;
        int tipoMoeda;

        // Executa o loop enquanto a opção escolhida não for 0 (Encerrar)
        while (opcao != 0) {
            switch (opcao) {
                // Adicionar moedas
                case 1:
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("Escolha a Moeda:");
                        System.out.println("1 - Real:");
                        System.out.println("2 - Dólar:");
                        System.out.println("3 - Euro:");
                        tipoMoeda = scanner.nextInt();
                    }
                    moeda = null;
                    if (tipoMoeda == 1) {
                        System.out.println("Digite o valor da moeda:");
                        double valor = scanner.nextDouble();
                        // Cria um objeto da classe Real com o valor informado
                        moeda = new Real(valor);
                    } else if (tipoMoeda == 2) {
                        System.out.println("Digite o valor da moeda:");
                        double valor = scanner.nextDouble();
                        // Cria um objeto da classe Dolar com o valor informado
                        moeda = new Dolar(valor);
                    } else {
                        System.out.println("Digite o valor da moeda:");
                        double valor = scanner.nextDouble();
                        // Cria um objeto da classe Euro com o valor informado
                        moeda = new Euro(valor);
                    }
                    cofrinho.adicionar(moeda);

                    break;
                // Remover moedas
                case 2:
                    tipoMoeda = 0;
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("Escolha a Moeda:");
                        System.out.println("1 - Real:");
                        System.out.println("2 - Dólar:");
                        System.out.println("3 - Euro:");
                        tipoMoeda = scanner.nextInt();
                    }
                    moeda = null;
                    if (tipoMoeda == 1) {
                        System.out.println("Digite o valor da moeda:");
                        double valor = scanner.nextDouble();
                        moeda = new Real(valor);
                    } else if (tipoMoeda == 2) {
                        System.out.println("Digite o valor da moeda:");
                        double valor = scanner.nextDouble();
                        moeda = new Dolar(valor);
                    } else {
                        System.out.println("Digite o valor da moeda:");
                        double valor = scanner.nextDouble();
                        moeda = new Euro(valor);
                    }

                    // Remove a moeda do cofrinho
                    cofrinho.remover(moeda);

                    break;
                // Listar moedas
                case 3:
                    cofrinho.listagemMoedas();
                    break;
                // Calcular valor total convertido para Real
                case 4:
                    cofrinho.totalConvertido();
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
            System.out.println("COFRINHO:");
            System.out.println("1- Adicionar moedas:");
            System.out.println("2- Remover moedas:");
            System.out.println("3- Listar moedas:");
            System.out.println("4- Calcular valor total convertido para Real:");
            System.out.println("0- Encerrar");
            opcao = scanner.nextInt();
        }

    }
}