
package org.example;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Agenda {

    private String[] nomes;
    private int[] idades;
    private float[] alturas;
    private int numPessoas;

    public Agenda() {
        nomes = new String[10];
        idades = new int[10];
        alturas = new float[10];
        numPessoas = 0;
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        if (numPessoas < 10) {
            nomes[numPessoas] = nome;
            idades[numPessoas] = idade;
            alturas[numPessoas] = altura;
            numPessoas++;
        } else {
            System.out.println("Agenda cheia! Não é possível adicionar mais pessoas.");
        }
    }

    public void removerPessoa(String nome) {
        int posicao = buscarPessoa(nome);
        if (posicao != -1) {
            for (int i = posicao; i < numPessoas - 1; i++) {
                nomes[i] = nomes[i + 1];
                idades[i] = idades[i + 1];
                alturas[i] = alturas[i + 1];
            }
            numPessoas--;
            nomes[numPessoas] = null;
            idades[numPessoas] = 0;
            alturas[numPessoas] = 0;
            System.out.println("Pessoa removida com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada na agenda!");
        }
    }

    public int buscarPessoa(String nome) {
        for (int i = 0; i < numPessoas; i++) {
            if (nomes[i].equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirAgenda() {
        if (numPessoas == 0) {
            System.out.println("Agenda vazia!");
        } else {
            System.out.println("Pessoas na agenda:");
            for (int i = 0; i < numPessoas; i++) {
                System.out.println("Nome: " + nomes[i] + ", Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }
    }

    public void imprimirPessoa(int index) {
        if (index >= numPessoas || index < 0) {
            System.out.println("Índice inválido!");
        } else {
            System.out.println("Nome: " + nomes[index] + ", Idade: " + idades[index] + ", Altura: " + alturas[index]);
        }
    }
}


