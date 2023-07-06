import java.util.ArrayList;

public class Cofrinho {

    // lista de moedas armazenadas no cofrinho
    ArrayList<Moeda> listamoedas = new ArrayList<Moeda>();

    // adiciona uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        listamoedas.add(moeda);
        System.out.println("Moeda adicionada ao cofrinho.");
    }

    // remove uma moeda do cofrinho
    public void remover(Moeda moeda) {
        listamoedas.remove(moeda);
        System.out.println("Moeda Removida do cofrinho.");
    }

    // calcula o valor total convertido para Real
    public void totalConvertido() {
        double total = 0;
        for (Moeda moeda : listamoedas) {
            total += moeda.converter();
        }
        System.out.println("Total convertido para Real: " + total);

    }

    // lista as moedas armazenadas no cofrinho
    public void listagemMoedas() {
        for (Moeda moeda : listamoedas) {
            moeda.infox();
        }
    }

}

