package org.example;

public class Elevador {
    int andarAtual = 0;
    int totalAndares;
    int capacidadeElevador;
    int pessoasNoElevador;

    public Elevador(int andarAtual, int totalAndares, int capacidadeElevador, int pessoasNoElevador) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.pessoasNoElevador = pessoasNoElevador;
    }


    public void entra( int total){
        if(total > capacidadeElevador || pessoasNoElevador > capacidadeElevador){
            System.out.println("capacidade não suportada");
        }else{
            pessoasNoElevador += total;
            capacidadeElevador += total;
        }
    }
    public void sai(int quantidade){
       pessoasNoElevador -= quantidade;
       capacidadeElevador -= quantidade;
    }

    public void sobe(int andares){

        if(andarAtual == totalAndares || andares > this.totalAndares){
            System.out.println("impossivel subir, já esta no último andar");
        }else{
            this.andarAtual += andares;
        }
    }

    public void desce(int andares){
        if(andarAtual == 0){
            System.out.println("impossivel descer, já está no terreo.");
        }else{
            this.andarAtual -= andares;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }
}
