
public class Cancion {
    private double[] tonos;
    private String titulo;
    public Cancion(double[] tonos, String titulo) {
        this.tonos = tonos.clone();
        this.titulo = titulo;
    }
    public double[] getTonos() {
        return tonos.clone();
    }
    public String getTitulo() {
        return titulo;
    }
}


public class Playlist {
    private Cancion[] canciones;
    private int cantidad;
    public Playlist(int capacidad) {
        canciones = new Cancion[capacidad];
        cantidad = 0;
    }
    public void agregarCancion(Cancion cancion) {
        if (cantidad < canciones.length) {
            canciones[cantidad++] = cancion;
        }
    }
    public int cancionesQueSuperanElUmbralDelRuido(double umbral) {

        int contador = 0;
        for (int i = 0; i < cantidad; i++) {
            double[] tonos = canciones[i].getTonos();
            for (int j = 0; j < tonos.length; j++) {
                if (tonos[j] > umbral) {
                    contador++;
                    break; // Si un tono supera el umbral, pasamos a la siguiente canción
                }
            }
        }
        return contador;
    }

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(5);
        
        playlist.agregarCancion(new Cancion(new double[]{10.5, 12.3, 9.8}, "Canción 1"));
        playlist.agregarCancion(new Cancion(new double[]{15.7, 25.1, 18.4}, "Canción 2"));
        playlist.agregarCancion(new Cancion(new double[]{8.2, 9.1, 7.5}, "Canción 3"));
        playlist.agregarCancion(new Cancion(new double[]{30.2, 22.6, 35.1}, "Canción 4"));
        double umbral = 20.0;
        int resultado = playlist.cancionesQueSuperanElUmbralDelRuido(umbral);
        
        System.out.println("Número de canciones que superan el umbral: " + resultado);
        // Output esperado: 2 (Canción 2 y Canción 4)
    }
}

}
