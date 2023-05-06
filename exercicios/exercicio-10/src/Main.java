import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

jogadorFutebol a = new jogadorFutebol("Ronaldinho","atacante",LocalDate.of(1999,01,01), "Brasileiro", 1.63, 78.00);

jogadorFutebol b = new jogadorFutebol("willian", "meio-campo",LocalDate.of(1990,01,01), "Brasileiro",1.60,97.00);




a.statusJogador();
a.impirimirAposentadoria();

b.statusJogador();
b.impirimirAposentadoria();


    }
}