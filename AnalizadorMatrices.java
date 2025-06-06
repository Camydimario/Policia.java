package testAnalizador;

import org.junit.Test;

public class AnalizadorDeMatrices {

	/**
 	 * post: devuelve la cantidad de elementos de ‘matriz’ que
 	 *       tenga al menos un valor 0.
 	 */
public int contarCeros(double[][] matriz){ 
int contar = 0;
 for(int i = 0; i < matriz.length; i ++){
for(int j = 0; j < matriz[i].length; j ++){
    if (matriz [i][j]==0){
        contar++;
    }
    }
}

return contar;
}

/**
 * post: devuelve la cantidad de elementos de ‘matriz’ cuyo valor
 *       esté en el rango [‘desde’, ‘hasta’].
 */

public int contarElementosEnElRango(double[][] matriz, double desde, double hasta){
    int contar=0;
for(int i = 0; i < matriz.length; i ++){
for(int j = 0; j < matriz[i].length; j ++){
 if (matriz[i][j] >= desde && matriz[i][j] <= hasta){
    contar++;
 }
    
}

}
 return contar;
}

/**
 * pre: ‘matriz’ es regular. 	
 * post: devuelve la cantidad de columnas de ‘matriz’ que tenga 
   *      al menos un valor 0.
*/
	public int contarColumnasConCeros(double[][] matriz){
        int contarColumnas= 0;
        for(int i = 0; i < matriz.length; i ++){
        for(int j = 0; j < matriz[i].length; j ++){
            if (matriz[i][j] == 0){
                contarColumnas++;
            }
        }
           
    }
  return contarColumnas;
}
/**
 * pre: ‘matriz’ es regular. 	
 * post: devuelve la cantidad de filas de ‘matriz’ que tenga 
   *      al menos un valor 0.
*/
	public int contarFilasConCeros(double[][] matriz){
          int contarFilas= 0;
        for(int i = 0; i < matriz.length; i ++){
        for(int j = 0; j < matriz[i].length; j ++){
            if (matriz[i][j] == 0){
               contarFilas++;
            }
        }
           
    }
  return contarFilas;
}

/**
 	 * post: devuelve un arreglo (con tantos elementos como filas tiene 
 	 *       'matriz') que tiene en cada posición el promedio de una fila del
 	 *       arreglo 'matriz'.
 	 */
public double[] promediarFilas(double[][] matriz){
      double[] promedio = new double[matriz.length];
      for(int i = 0; i < matriz.length; i ++){
        double suma = 0;
        for(int j = 0; j < matriz[i].length; j ++){
              suma += matriz[i][j];
        }    
     promedio[i] = suma / matriz[i].length;

}
return promedio;
}

/**
 	 * post: devuelve un arreglo (con tantos elementos como filas tiene 
 	 *       'matriz') que tiene en cada posición el promedio de una fila del
 	 *       arreglo 'matriz'.
 	 */
public double[] promediarColumnas(double[][] matriz){
      double[] promedio = new double[matriz.length];
      for(int i = 0; i < matriz.length; i ++){
        double suma = 0;
        for(int j = 0; j < matriz[i].length; j ++){
              suma += matriz[i][j];
        }    
     promedio[i] = suma / matriz[i].length;

}
return promedio;
}





public static void main(String[] args) {
    AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
    double [][] mat = {
        {1,2,3,0},
        {5,4,0,3},
        {6,9,8,0},
    };
    


    System.out.println("Contar ceros: " +ana.contarCeros(mat));
    System.out.println("Contar elemento rango : " + ana.contarElementosEnElRango(mat,1,8));
    System.out.println("Contar Columna con ceros: " +ana.contarColumnasConCeros(mat));
    System.out.println("Contar Filas con ceros: " +ana.contarFilasConCeros(mat));
    System.out.println("Promedio filas : " +ana.promediarFilas(mat));
    //System.out.println("Promedio Columnas : " + ana.promediarColumnas(mat));
}



}

----------------------------------------------------------------------------------------------------------------------------------------------------
