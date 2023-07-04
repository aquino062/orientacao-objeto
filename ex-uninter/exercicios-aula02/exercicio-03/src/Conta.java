public class Conta {
    int numero;
    String titular;
    double saldo;
    double limite;

    public Conta(int numero, String titular, double saldo, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void info() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: " + limite);
        System.out.println(" ");


    }

    void sacar(double valor) {

        if (valor > limite || valor > saldo) {
            System.out.println("Saldo indisponivel ou Limite atingido");
        } else if (valor <= 0) {
            System.out.println("Valor Inválido");

        } else {
            saldo -= valor;
            System.out.println("Saque " + valor + " efetuado com Sucesso");
            System.out.println(" ");
        }

    }

    void deposito(double valor) {
        if (valor < 0) {
            System.out.println("Valor Inválido");
        } else {
            saldo += valor;
            System.out.println("Deposito " + valor + " efetuado com Sucesso");
            System.out.println(" ");
        }
    }

    void transferir(Conta destino, double valor) {
        if (valor > saldo) {
            System.out.println("saldo indisponivel");
        } else if (valor <= 0) {
            System.out.println("Valor invalido");
        } else {
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferencia feita com Sucesso");
            System.out.println(" ");

        }
    }


}
