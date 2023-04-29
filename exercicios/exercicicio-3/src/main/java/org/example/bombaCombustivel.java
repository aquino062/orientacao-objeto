package org.example;

public class bombaCombustivel {

    private String tipoCombustivel;
    private float valorPorLitro;
    private float quantidadeCombustivel;


    public void abastecerValor() {

    }
        public float abastecerLitro ( float qntdLitros){
            float valorTotal = qntdLitros * this.valorPorLitro;
            if (qntdLitros > this.quantidadeCombustivel) {
                System.out.println("Não há combustível suficiente na bomba!");
                return 0;
            }
            this.quantidadeCombustivel -= qntdLitros;
            return valorTotal;
        }


        public void alterarValor ( float valor){
            this.valorPorLitro = valor;
        }

        public void alterarCombustivel (String tipo){
            this.tipoCombustivel = tipo;
        }

        public void alterarQntdCombustivelBomba ( float total){
            this.quantidadeCombustivel = total;
        }

    public bombaCombustivel(String tipoCombustivel, float valorPorLitro, float quantidadeCombustivel){
            this.tipoCombustivel = tipoCombustivel;
            this.valorPorLitro = valorPorLitro;
            this.quantidadeCombustivel = quantidadeCombustivel;
        }

        public String getTipoCombustivel () {
            return tipoCombustivel;
        }

        public float getValorPorLitro () {
            return valorPorLitro;
        }

        public float getQuantidadeCombustivel () {
            return quantidadeCombustivel;
        }

    }


