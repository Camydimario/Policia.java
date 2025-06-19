package PruebaCine;
public class Cine {
int cantidadAsientosLibres;
int [][] butacas;
boolean estaocupado = false;
private double precio;



public double contizarAsientosLibres(int cantidad){
double precio =0;
int cantidadAsientosLibres =0;
for ( int i = 0;i < butacas.length; i ++){
    for(int j = 0; j < butacas[i].length; j++){
        if(butacas[i][j] == 0){
            cantidadAsientosLibres ++;
       //if ( butacas[i][j] == cantidadAsientosLibres && !estaocupado){
           // cantidadAsientosLibres ++;
          //  precio += butacas[i][j];
            //return precio;
           
        }
    }}
   return cantidadAsientosLibres;
} 
//return precio;


public static void main (String [] args){
    Cine cine = new Cine();
   
    System.out.println("mostrar asientos");
        cine.butacas[0][0] = 0; // Fila 1, Asiento 1 ocupado
        cine.butacas[0][0] = 0; // Fila 2, Asiento 3 ocupado
        cine.butacas[0][0] = 0; // Fila 4, Asiento 5 ocupado
 cine.contizarAsientosLibres(6);
}





}
