public class Euro extends Moeda {

    // Chama o construtor da classe pai (Moeda) passando o valor como argumento
    public Euro(double valor) {
        super(valor);
        this.valor = valor;
    }

    // Implementação padrão do método equals, que verifica se o objeto é igual a outro objeto
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    // Imprime a informação sobre a moeda Euro
    @Override
    public void infox() {
        System.out.println("Euro: " + valor);
    }

    // Retorna o valor da moeda Euro considerando o euro a 6 reais
    @Override
    public double converter() {
        return valor * 6.0;

    }
}
