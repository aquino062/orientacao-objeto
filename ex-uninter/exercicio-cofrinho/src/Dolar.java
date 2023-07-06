public class Dolar extends Moeda {

    // Chama o construtor da classe pai (Moeda) passando o valor como argumento
    public Dolar(double valor) {
        super(valor);
        this.valor = valor;
    }

    // Implementação padrão do método equals, que verifica se o objeto é igual a outro objeto
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    // Imprime a informação sobre a moeda Dolar
    @Override
    public void infox() {
        System.out.println("Dolar: " + valor);
    }

    // Retorna o valor da moeda Dolar, considerando o dolar a 5 reais
    @Override
    public double converter() {
        return valor * 5.0;
    }


}
