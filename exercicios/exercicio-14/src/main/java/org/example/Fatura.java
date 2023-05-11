package org.example;

public class Fatura {

    private String numero;
    private String descricao;
    private int qntdCompradaItem;
    private double preco;

    public Fatura(String numero, String descricao, int qntdCompradaItem, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qntdCompradaItem = qntdCompradaItem;
        this.preco = preco;
    }

    public double getTotalFatura() {
        double total = qntdCompradaItem * preco;

        if(total > 0 ){

        return total;
        }else{
            return 0;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQntdCompradaItem() {
        return qntdCompradaItem;
    }

    public void setQntdCompradaItem(int qntdCompradaItem) {
        this.qntdCompradaItem = qntdCompradaItem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
