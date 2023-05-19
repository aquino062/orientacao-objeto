package contas;

public class Conta {
   protected String cliente;
    protected double saldo;

    public Conta() {
        System.out.println("Agência 0261");
    }

    //metodos
     protected void exibirSaldo() {
        System.out.println("saldo: R$ " + saldo);
    }
}
