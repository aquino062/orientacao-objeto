public class Ingresso {
    public String nomeEvento;
    public double valor;

    public Ingresso(String nomeEvento, double valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }
    public Ingresso(){

    }

    public void imprimir(){
    System.out.println("Nome do evento: "+ nomeEvento);
    System.out.println("Valor: "+ valor);
    }
}
