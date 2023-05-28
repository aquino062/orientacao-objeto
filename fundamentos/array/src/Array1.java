public class Array1 {
    public static void main(String[] args) {
        String[] carros = {"Ferrari", "Fusca", "camaro", "uno"};
        System.out.println("Tamanho do array: " + carros.length);
        System.out.println("Carro: " + carros[2]);
        carros[2] = "Porsche";
        System.out.println("Carro: " + carros[2]);
        System.out.println("-----------------------");

        System.out.println("Carros:");
        for (int i = 0; i < carros.length; i++){
            System.out.println( carros[i]);

        }

    }
}
