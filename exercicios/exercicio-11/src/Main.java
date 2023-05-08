
public class Main {
    public static void main(String[] args) {


        Ingresso vingadores = new Ingresso(35.70);
        IngressoVipe vingadoresVip = new IngressoVipe(35.70, 20.00);

        Ingresso starWars = new Ingresso(45.60);
        IngressoVipe starWarsVip = new IngressoVipe(45.80,12.20);


        System.out.println("vingadores");

        vingadores.imprimirValor();
        vingadoresVip.imprimirValor();

        System.out.println("\n star Wars");

        starWars.imprimirValor();
        starWarsVip.imprimirValor();
    }

}