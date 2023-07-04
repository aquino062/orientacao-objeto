public class IngressoVip extends Ingresso {
    public double adicional;

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor);
        this.adicional = adicional;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor adicional " + adicional);
        System.out.println("Total do ingresso: " + (valor + adicional));
    }

}
