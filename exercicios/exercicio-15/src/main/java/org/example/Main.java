package org.example;


public class Main {
    public static void main(String[] args) {

        Funcionario estagiario01 = new Funcionario("willian ","aquino", 500);
        Funcionario estagiario02 = new Funcionario("joao ","aquino", 700);
        Funcionario estagiario03 = new Funcionario("maria ","aquino", 900);



        estagiario01.salarioAnual();
        estagiario02.salarioAnual();

        estagiario01.aumentoSalario(12);
        estagiario02.aumentoSalario(10);

        estagiario01.salarioAnual();
        estagiario02.salarioAnual();

System.out.println("\nTotal de Funcionarios: " + Funcionario.getContadorFuncionario());




    }
}