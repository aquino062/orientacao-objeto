
public class Main {
    public static void main(String[] args) {

        LivroDigital a1 = new LivroDigital("as cronicas de narnia", new Autor("joao", "joao@gmail.com", "Brasileiro"), "ação", 8900, 5, 9.0);

        LivroFisico a2 = new LivroFisico("Game of thones", new Autor("Robert", "robert@gmail.com", "Americano"), "ação", 2500, 900, 2);



        a1.info();
        System.out.println(" ");
        a2.info();


        

    }
}