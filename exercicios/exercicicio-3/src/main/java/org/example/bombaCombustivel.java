package org.example;

public class bombaCombustivel {

    private String tipoCombustivel;
    private float valorPorLitro;
    private float quantidadeCombustivel;

    public bombaCombustivel(String tipoCombustivel, float valorPorLitro, float quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerValor(float valor) {
        float qntsLitros = valor / valorPorLitro;
        if (valor > quantidadeCombustivel) {
            System.out.println("Não há combustivel suficiente na bomba.");
        } else {
            System.out.println("voce abasteceu " + qntsLitros + " litros de " + tipoCombustivel);
            this.quantidadeCombustivel -= qntsLitros;

        }
    }

    public void abastecerLitro(float totalLitros) {

        float totalApagar = valorPorLitro * totalLitros;
        if (totalLitros > quantidadeCombustivel) {
            System.out.println("Não há combustivel suficiente na bomba.");

        } else {
            System.out.println("voce abasteceu " + totalLitros + " litros de " + tipoCombustivel);
            this.quantidadeCombustivel -= totalLitros;
        }
    }

    public void alterarValor(float valor) {
        this.valorPorLitro = valor;
    }

    public void alterarCombustivel(String tipo) {
        this.tipoCombustivel = tipo;
    }

    public void alterarQntdCombustivelBomba(float total) {
        this.quantidadeCombustivel = total;
    }

    public float getQuantidadeCombustivel() {

        System.out.println("litros Disponiveis na bomba:");
        return quantidadeCombustivel;
    }
}
