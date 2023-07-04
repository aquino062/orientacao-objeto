
public class Main {
    public static void main(String[] args) {

        Ingresso a1 = new Ingresso("homem aranha",100.00);

        IngressoVip a2 = new IngressoVip("homem aranha",100.00,20.00);

        a1.imprimir();
        System.out.println(" ");
        a2.imprimir();

    }
}