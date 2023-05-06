
public class Main {
    public static void main(String[] args) {


        Data d = new Data(01,2,1999);
        d.clone();

        System.out.println(d.getAno());
        System.out.println(d.getMesExtenso());
        System.out.println(d.getDia());
        d.clone();
        System.out.println(d.clone());
     
    }
}