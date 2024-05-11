public class ArmaCorta extends Arma {
    private boolean automatica;
    private int alcanceMetros;

    public ArmaCorta(Policia policia, String marca, String calibre, String estado, int municiones, double alcance, boolean automatica) {
        super();
        this.automatica = automatica;

    }
//metodos

    public void disparo (int alcanzeMetro) {
        int alcanzeMaximo = 200;
        if (alcanzeMetro !=  200 ) {
            System.out.println( "el arma no logra disparar a los 200 metros");

        } else if ( alcanzeMetro == 200) {
            System.out.println("El arma llega a disparar los 200 metros");
        }
    }
    public boolean disparoMas200m() {
        if (alcanceMetros > 200) {
            return true;
        }
        else return false;
    }

}
