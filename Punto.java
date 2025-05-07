//clase

public class Punto {

    private double x;
    private double y;

    //constructor
    public Punto (double x, double y) {
    this.x=x;
    this.y=y;

    }

    public double obtenerX() {
        return this.x;



    }
    public double obtenerY(){
        return this.y;


    }
    public void cambiarX(double nuevoX){
      this.x = nuevoX;


    }
    public void cambiarY(double nuevoY){
        this.y = nuevoY;


    }
    
    //saber si el punto está sobre el eje de las X:
    public boolean estaSobreEjeX(){
      return this.y == 0;
      
      }

    // si ponia el if y el return true era un meme, osea 
    //estaba bien pero era meme jaajaj
    
    ///saber si el punto está sobre el eje de las Y:
    public boolean estaSobreEjeY(){
       return this.x == 0;

    }
    
    //saber si el punto es el origen de coordenadas:
    public boolean esElOrigen(){
    return estaSobreEjeX() && estaSobreEjeY();

    }

    public static void main (String [] args) {
        Punto p1 = new Punto(1,1);
        System.out.println(p1.x);
        System.out.println("Coordenadas x" + p1.obtenerX());
        System.out.println("Coordenadas y" + p1.obtenerY());
        p1.cambiarX(3);
        p1.cambiarY(2);
        System.out.println("¿esta sobre el eje x ?" + p1.estaSobreEjeX());
        System.out.println("¿esta sobre el eje y ?" + p1.estaSobreEjeY());
        System.out.println("¿Es el origen ?" + p1.esElOrigen());
    }


}
