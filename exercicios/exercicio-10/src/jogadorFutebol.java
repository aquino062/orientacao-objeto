
import java.time.LocalDate;
import java.time.Period;

public class jogadorFutebol {

    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;


    public jogadorFutebol(String nome, String posicao, LocalDate dataNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public void statusJogador() {
        System.out.println("nome: " + nome);
        System.out.println("posição: " + posicao);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso + " Kg");

    }

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dataNascimento, dataAtual).getYears();
    }


    public int tempoAposentadoria() {

        int tempoAposentadoria;

        if (posicao.equals("atacante")) {
            tempoAposentadoria = 35 - calcularIdade();
        } else if (posicao.equals("meio-campo")) {
            tempoAposentadoria = 38 - calcularIdade();

        } else {
            tempoAposentadoria = 40 - calcularIdade();
        }
        return tempoAposentadoria;
    }

    public void impirimirAposentadoria() {
        System.out.println("faltam " + tempoAposentadoria() + " anos para o jogador " + getNome() + " se aposentar");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
