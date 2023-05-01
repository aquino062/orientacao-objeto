public class Funcionario {
    private String nome;
    private String sobreNome;
    private double salarioMensal;

    public Funcionario(String nome, String sobreNome, double salarioMensal) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salarioMensal = salarioMensal;
    }


    public void reajustePorcentagem(double porcentagemAumento) {
        double aumento = this.salarioMensal * porcentagemAumento / 100;
        this.salarioMensal += aumento;
        System.out.println("salário Reajustado em " + porcentagemAumento + "%");
    }

    public double salarioAnual() {
        System.out.println("O salário Anual é de R$:");
        return this.salarioMensal * 12;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {

        this.sobreNome = sobreNome;
    }

    public double getSalarioMensal() {
        System.out.println("salário mensal é de R$:");
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal <= 0) {
            this.salarioMensal = 0;
        } else {

            System.out.println("Seu salário mensal foi de R$: " + salarioMensal);
            this.salarioMensal = salarioMensal;
        }
    }
}
