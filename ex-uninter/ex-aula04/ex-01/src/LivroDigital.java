public class LivroDigital extends Livro {

    private int dowload;
    private double tamanho;

    public LivroDigital(String titulo, Autor autor, String genero, int edicao, int dowload, double tamanho) {
        super(titulo, autor, genero, edicao);
        this.dowload = dowload;
        this.tamanho = tamanho;
    }

    public LivroDigital() {

    }

    @Override
    public void info() {
        super.info();
        System.out.println("Dowload: " + dowload);
        System.out.println("Tamanho: " + tamanho);
    }

    public int getDowload() {
        return dowload;
    }

    public void setDowload(int dowload) {
        this.dowload = dowload;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
