public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta(225, "Willian", 1500, 500);
        Conta c2 = new Conta(226, "samara", 2000, 500);

        c1.info();
        c2.info();
        c1.transferir(c2,100);


        c1.info();
        c2.info();
    }
}