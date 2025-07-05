package PruebaTest;
public class Cine {
double[][] butacas;

public double contizarAsientosLibres(int cantidad){
//int cantidadAsientosLibres =0;

double preciototal =0;
for ( int i = 0;i < butacas.length; i ++){
    for(int j = 0; j < butacas[i].length; j++){
        if( butacas[i][j] ==0){
         // cantidadAsientosLibres ++;
          preciototal += 10;
           
           }
        
        }
    }
    return  preciototal;
}


public boolean estaocupado() {
    return false;

}
 
}
