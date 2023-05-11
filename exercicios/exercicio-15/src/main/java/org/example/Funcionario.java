package org.example;

public class Funcionario {
    private String nome;
    private String sobreNome;
    private double salarioMensal;

    private static int contadorFuncionario = 0;

    public Funcionario(String nome, String sobreNome, double salarioMensal) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salarioMensal = salarioMensal;
        contadorFuncionario++;
    }

    public void aumentoSalario(int porcentagem) {
        double aumento = (this.salarioMensal * porcentagem) / 100;
        double percentual = (aumento / this.salarioMensal) * 100;
        System.out.println( "\n"+ nome + "seu aumento foi de R$: " + aumento + " (" + percentual + "%)");
        double novoSalario = this.salarioMensal + aumento;
        System.out.printf("Novo Salario: R$: %.2f", novoSalario);
        this.salarioMensal = novoSalario;
    }

    public void salarioAnual(){
        double salarioAnual = this.salarioMensal * 12;
        System.out.printf("\nseu salario Anual é R$: %.2f" , salarioAnual);
    }

    public static int getContadorFuncionario() {
        return contadorFuncionario;
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
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
