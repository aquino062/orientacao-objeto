public class Ingresso {
    private double valorIngresso;

    public Ingresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public void imprimirValor(){
        System.out.printf(" valor do ingresso R$ %.2f", this.valorIngresso);
    }

    public double getValorIngresso() {
        return valorIngresso;
    }
}

