public class IngressoVipe extends Ingresso {

   private double valorAdicional;

    public IngressoVipe(double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVip() {
        return getValorIngresso() + this.valorAdicional;
    }
    @Override //estamos sobrescrevendo o método da classe pai Ingresso
    public void imprimirValor(){
        System.out.printf(" \n valor do ingresso vipe R$ %.2f" , getValorVip());
}
}
