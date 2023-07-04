public class Aluno {
    String nome, curso;
    Avaliacao notas;


    public Aluno(String nome, String curso, Avaliacao notas) {
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    public void info() {
        System.out.println("Aluno: " + nome);
        System.out.println("Curso:" + curso);
        System.out.printf("Média A: %.1f \n", notas.mediaAritmetica());
        System.out.printf("Média b: %.1f \n", notas.mediaPonderada());
        System.out.println(" ");
    }
}
