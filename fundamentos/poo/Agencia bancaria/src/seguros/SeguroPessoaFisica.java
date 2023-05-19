package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta{
    public static void main(String[] args) {
        SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
        cc3.cliente = "Maikão";
        cc3.saldo = 12000;
        System.out.println("Cliente: "+ cc3.cliente);
        cc3.exibirSaldo();
    }
}
