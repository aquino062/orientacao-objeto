public class Main {
    public static void main(String[] args) {

        Cofrinho c = new Cofrinho();

        c.add(new Moeda("euro",0.5));
        c.add(new Moeda("euro",1));
        c.add(new Moeda("euro",0.1));
        c.add(new Moeda("euro",0.05));

        System.out.printf("o total no cofrinho é: %.2f\n" , c.calcularTotal());
    }
}