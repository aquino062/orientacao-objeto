package org.example;

public class contaCorrente {

    private String nomeCorrentista;
    private float saldoConta;
    private String numeroConta;

    //construtor com saldo obrigatorio
    public contaCorrente(String nomeCorrentista, float saldoConta, String numeroConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldoConta = saldoConta;
        this.numeroConta = numeroConta;
    }

    //contrutor opcional
    public contaCorrente(String nomeCorrentista, String numeroConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldoConta = 0;
        this.numeroConta = numeroConta;
    }


// imprimir dados
    public void imprimirDados() {
        System.out.println("Nome correntista: "+nomeCorrentista);
        System.out.println("Saldo conta: R$ "+saldoConta);
        System.out.println("Número da conta: "+ numeroConta);
    }



// alterar nome correntista
    public void alterarNome(String novoNome){
        this.nomeCorrentista = novoNome;
    }
// depósito de dinheiro
    public void depositarDinheiro(float valor){
        this.saldoConta += valor;
    }
    //sacar

    public void sacar(float saque){
        if(saque <= saldoConta ){
            this.saldoConta -= saque;
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public float getSaldoConta() {
        return saldoConta;
    }



    public String getNumeroConta() {
        return numeroConta;
    }


}
