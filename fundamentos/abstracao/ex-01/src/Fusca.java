
public class Fusca {

    public static void main(String[] args) {

        Carro fusca = new Carro();
        fusca.ano = 1999;
        fusca.cor = "branco";


        System.out.println("Carro: Fusca");
        System.out.println("Ano: " + fusca.ano);
        System.out.println("Cor: " + fusca.cor);
        fusca.ligar();
        fusca.acelerar();

    }


}

