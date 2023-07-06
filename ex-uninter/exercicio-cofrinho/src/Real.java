public class Real extends Moeda {

    // Chama o construtor da classe pai (Moeda) passando o valor como argumento
    public Real(double valor) {
        super(valor);
        this.valor = valor;
    }

    // Implementação padrão do método equals, que verifica se o objeto é igual a outro objeto
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    // Imprime a informação sobre a moeda Real
    @Override
    public void infox() {
        System.out.println("Real: " + valor);
    }

    // Retorna o valor da moeda Real
    @Override
    public double converter() {
        return this.valor;
    }
}
