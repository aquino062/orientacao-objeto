
public class Main {
    public static void main(String[] args) {


        String[] nipes = {"ouros", "copas", "espadas", "paus"};
        String[] faces = {"Az", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        // as linhas abaixos recuperam de forma aleatoria o conteudo dos arrays
        String nipe = nipes[(int) (Math.random() * 4)];
        String face = faces[(int) (Math.random() * faces.length)];

        System.out.println("Jogo de cartas");
        System.out.println("----------------");
        System.out.println(face + " de " + nipe);
    }
}