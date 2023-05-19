public class Dumbo {
    public static void main(String[] args) {
        Aviao dumbo = new Aviao();
        dumbo.ano = 2015;
        dumbo.cor = "Preto";
        dumbo.envergadura = 11;

        System.out.println("Avião: Dumbo");
        System.out.println("Ano:" + dumbo.ano);
        System.out.println("Cor: " + dumbo.cor);
        System.out.println("Envergadura: "+ dumbo.envergadura + " metros");
        dumbo.aterrizar();
        dumbo.ligar();
        dumbo.acelerar();


    }
}
