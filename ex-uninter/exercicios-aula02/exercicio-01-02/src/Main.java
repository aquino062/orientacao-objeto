
public class Main {
    public static void main(String[] args) {
        Avaliacao a = new Avaliacao(8, 3, 7.5);

        //System.out.printf("Média Aritmetica: %.1f\n" , a.mediaAritmetica());
        // System.out.printf("Média ponderada: %.1f\n" , a.mediaPonderada());

        Aluno willian = new Aluno("willian aquino", "ads", new Avaliacao(9, 5, 6));

        Aluno aluno02 = new Aluno("joao pereira", "direito", new Avaliacao(8, 7.1, 9));


        willian.info();
        aluno02.info();
    }
}