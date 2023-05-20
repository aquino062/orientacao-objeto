package contas;

public class Conta {
    private String cliente;
    private double saldo;

    public Conta() {
        System.out.println("Agência 0261");
    }

    //metodos
    protected void exibirSaldo() {
        System.out.println("saldo: R$ " + saldo);
    }

    void sacar(double valor) {
        saldo -= valor;
        System.out.println("Debito: R$ " + valor);
    }

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Crédito: R$ " + valor);
    }

    void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferencia:R$ " + valor);
    }

    double soma(double cc1, double cc2) {
        double total = cc1 + cc2;
        return total;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
