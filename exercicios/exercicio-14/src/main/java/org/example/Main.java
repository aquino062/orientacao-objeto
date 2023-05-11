package org.example;


public class Main {
    public static void main(String[] args) {

        Fatura fatura = new Fatura("123","mouse",10,20);



        System.out.println("Número da fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQntdCompradaItem());
        System.out.println("Preço por item: R$" + fatura.getPreco());
        System.out.println("Total da fatura: R$" + fatura.getTotalFatura());

    }
}