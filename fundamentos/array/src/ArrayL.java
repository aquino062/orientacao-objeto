import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> contatos = new ArrayList<>();
        contatos.add("willian aquino");
        contatos.add("9999-9999");
        contatos.add("wil@hotmail.com");

        contatos.add("neymar junior");
        contatos.add("9999-9999");
        contatos.add("menino-ney@hotmail.com");
        System.out.println("Tamanho do array: " + contatos.size());
        System.out.println(contatos);
        System.out.println("E-mail willian aquino " + contatos.get(2));
        System.out.println("---------------------------------------------");
        for (int i = 0;i < contatos.size();i++ ){
            System.out.println(contatos.get(i));
        }


    }
}
