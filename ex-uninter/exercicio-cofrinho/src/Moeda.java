public abstract class Moeda {
    protected double valor;

    // Atribui o valor da moeda à variável valor
    public Moeda(double valor) {
        this.valor = valor;
    }

    // Verifica se o objeto é o próprio objeto (referência igual)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moeda)) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(moeda.valor, valor) == 0;
    }

    // Método abstrato que será implementado pelas subclasses para imprimir informações sobre a moeda
    public abstract void infox();

    // Método abstrato que será implementado pelas subclasses para converter o valor da moeda
    public abstract double converter();
}
