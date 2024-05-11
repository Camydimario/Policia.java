

public abstract class Arma {
    Policia policia;
    private int cantidadMuniciones;
    private double alcanzeMetros;
    private String marca = "Samsung";
    private int calibre;
    private boolean estado= true;
private String estados= "En Uso";

//constructor
    public Arma () {
        this.policia = policia;
        this.marca= marca;
        this.calibre=calibre;
        this.estados= estados;
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanzeMetros = alcanzeMetros;
    }
//metodos

    void usarArma (int calibre) {
        if ( calibre >=9) {
            return;
        }
        if (estado == true) {
            System.out.println("En Uso");
        }
    }

    public boolean enCondiciones() {
        return estado && calibre >= 9;
    }
}

