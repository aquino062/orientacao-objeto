package org.example;

public class Elevador {
    int andarAtual;
    int totalAndares;
    int capacidadeElevador;
    int pessoasNoElevador;

    public Elevador(int totalAndares, int capacidadeElevador) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.andarAtual = 0;
        this.pessoasNoElevador = 0;
    }


    public void entra(int total) {
        if ((total + this.pessoasNoElevador) > this.capacidadeElevador) {
            System.out.println("capacidade não suportada");
        } else {
            this.pessoasNoElevador += total;
            System.out.println("Entrou " + total + " pessoa(s) no elevador.");

        }
    }

    public void sai(int quantidade) {
        if ((this.pessoasNoElevador - quantidade) < 0) {
            System.out.println("Não há pessoas suficientes no elevador");
        } else {
            this.pessoasNoElevador -= quantidade;

            System.out.println("Saiu " + quantidade + " pessoa(s) do elevador");

        }

    }

    public void sobe(int andares) {

        if ((this.andarAtual + andares) > this.totalAndares) {
            System.out.println("impossivel subir");
        } else {
            this.andarAtual += andares;
            System.out.println("Elevador subiu para o " + this.andarAtual + "º andar");
        }
    }

    public void desce(int andares) {
        if ((this.andarAtual - andares) < 0) {
            System.out.println("impossivel descer");
        } else {
            this.andarAtual -= andares;
            System.out.println("Elevador desceu para o " + this.andarAtual + "º andar");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }
}
