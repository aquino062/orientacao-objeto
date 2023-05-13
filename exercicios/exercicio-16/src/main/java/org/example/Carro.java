package org.example;

public class Carro {
    private String nome;
    private int tanqueCombustivel;

    public Carro(String nome, int tanqueCombustivel) {
        this.nome = nome;
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public void abastercerCarro(int qntdLitros) {
        if (qntdLitros <= 0) {
            System.out.println("Digite uma quantidade de litros válida.");
        } else if (qntdLitros + tanqueCombustivel > 50) {
            System.out.println("Não é possível abastecer acima da capacidade máxima de 50 litros.");

        } else {
            System.out.println("Abastecido com sucesso.");
            tanqueCombustivel += qntdLitros;
        }
    }

    public void moverCarro(int distancia) {
        int kmRodados = 0;
        int qntdCombustivel;

        if (distancia <= 0) {
            System.out.println("Digite uma distancia válida");
        } else {
            qntdCombustivel = distancia / 15;
            if (qntdCombustivel > tanqueCombustivel) {
                System.out.println("combustivel insuficiente");
            } else {
                kmRodados += distancia;
                qntdCombustivel = kmRodados / 15;
                System.out.println("Distancia percorrida: " + distancia + "km");
                System.out.println("Quantidade de combustivel gasto foi " + qntdCombustivel + " Litro(s)");
                tanqueCombustivel -= qntdCombustivel;
            }

        }

    }

    public String getNome() {
        return nome;
    }

    public int getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTanqueCombustivel(int tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }
}
