public class Camaro {
    public static void main(String[] args) {
        Carro camaro = new Carro();
        camaro.ano = 2015;
        camaro.cor = "branco";


        System.out.println("Carro: camaro");
        System.out.println("Ano: " + camaro.ano);
        System.out.println("Cor: " + camaro.cor);
        camaro.ligar();
        camaro.acelerar();
    }
}
