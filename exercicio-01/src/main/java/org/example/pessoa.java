package org.example;

import java.time.LocalDate;
import java.time.Period;


public class pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private float altura;


    public pessoa(String nome, LocalDate dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public void impimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
    }

    public int calculaIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
