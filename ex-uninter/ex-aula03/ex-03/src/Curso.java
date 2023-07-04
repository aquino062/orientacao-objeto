public class Curso {

    String nome;
    Double mensalidade;

    public Curso(String nome, Double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    void info(){
        System.out.println("Nome do curso "+ nome);
        System.out.println("Mensalidade: "+ mensalidade);
    }



}
