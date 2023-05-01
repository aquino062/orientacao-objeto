
public class Main {
    public static void main(String[] args) {

        Funcionario a = new Funcionario("joao","pereira",1000);




        a.setSalarioMensal(2000);
        System.out.println(a.salarioAnual());
        a.reajustePorcentagem(10);
        System.out.println(a.getSalarioMensal());
        System.out.println(a.salarioAnual());






    }
}