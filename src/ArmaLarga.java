public class ArmaLarga extends Arma implements Comparable {

    private int nivel;
    private boolean renarSello;
    private String usoDescripcion;


    //constructor
    public ArmaLarga(Policia policia, String marca, String calibre, String estado, int municiones, double alcance, int nivel, String renarSello, String usoDescripcion) {
        super();
        this.nivel = nivel;
        this.renarSello = true;
        this.usoDescripcion = usoDescripcion;


    }

    @Override
    public void Comparable() {
        int MaximoNivel = 5;
        int BajoNivel = 1;
        int ArmaLarga = 0;


        if (ArmaLarga == MaximoNivel) {
            System.out.println("El arma es mayor");
        }
        if (ArmaLarga <= MaximoNivel) {
            System.out.println("El arma es menor");

        } else if (ArmaLarga != 2) {


        }

    }
}