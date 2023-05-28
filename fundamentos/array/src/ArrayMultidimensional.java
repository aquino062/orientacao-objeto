public class ArrayMultidimensional {
    public static void main(String[] args) {
        String[][] agenda = {{"willian", "9999-9999", "wil@hotmail.com"}, {"bil", "5555-5555", "bil@gmail.com"},
                {"chaves", "2222-2222", "chaves@gmail.com"}};
        // recuperar telefone do willian
      //  System.out.println(agenda[0] [1]);
        
        // as estruturas abaixos percorrem os indices do array
        for(int i = 0; i < agenda.length;i++){
            System.out.println("-------------------");
            for(int j = 0; j < agenda.length;j++){

                System.out.println(agenda[i][j]);
            }

        }

    }
}
