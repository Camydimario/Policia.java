import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Policia policia = new Policia();
        policia.nombre = "Juan";
        policia.apellido = "Gomez";
        policia.legajo = Integer.parseInt("65210");

        System.out.println("----Policia----");
        System.out.println(" Nombre : Juan");
        System.out.println(" Apellido : Gomez");
        System.out.println(policia.legajo);
    }

    Arma arma = new Arma() {
        @Override
        public boolean enCondiciones() {
            return super.enCondiciones();
        }

    @Override
    void usarArma(int calibre) {
        super.usarArma(calibre);
    }

    };
}






