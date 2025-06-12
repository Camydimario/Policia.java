package TestCine;
public class Cine {

private int cantidad;
/*se crea un cine con la cantidad de ansientos */
public Cine (int cantidad) {
  
    if(cantidad > 0 && cantidad < 50){
            this.cantidad = cantidad;
    }
}

/*se almacenan los aceintos  */
public int Almacenar(int [][] asientos){
      for (int i =0; i < asientos.length; i ++) {
        for (int j =0; j < asientos[i].length; j++) {
            return asientos.length;
}
}
   return 0;
}      


/*se cuentas las filas con la cantidad de asientos 0 */
public int Contarfilas0 (int [][] asientos){
    int contarfilas =0;
    for (int i =0; i < asientos.length; i ++) {
        for (int j =0; j < asientos[i].length; j++) {
            if (asientos[i][j] == 0){
                contarfilas++;
            }
        }
    }
return contarfilas;
}

/*se cuentas las columnas con la cantidad de asientos 0 */
public int Contarcolumnascon0 (int [][] asientos){
    int contarcolumnas =0;
    for (int i =0; i < asientos.length; i ++) {
        for (int j =0; j < asientos[i].length; j++) {
            if (asientos[i][j] == 0){
               contarcolumnas++;
            }
        }
    }
return contarcolumnas;
}


/*sacar el maximo de asientos */
public double MaximoAsientos (int [][] asientos){
   int maximo = asientos[0][0];
     for (int i =0; i < asientos.length; i ++) {
     for (int j =0; j < asientos[i].length; j++) {
         if (asientos[i][j] > maximo){
           maximo = asientos[i][j];
        }}
}
return maximo;
}



/*sacar el minimo de asientos */
public double MinimoAsientos (int [][] asientos){
   int minimo = asientos[0][0];
     for (int i =0; i < asientos.length; i ++) {
     for (int j =0; j < asientos[i].length; j++) {
         if (asientos[i][j] < minimo){
          minimo = asientos[i][j];
        }}
}
return minimo;
}

/*sacar el promdio de los asientos */
public double PromedioAsientos (int [][] asientos){
    double suma =0;
         for (int i =0; i < asientos.length; i ++) {
     for (int j =0; j < asientos[i].length; j++) {
        suma += asientos[i][j];
}
}

return suma / asientos.length;
}
/*Contar total de filas */

public int ContarFilas (int [] [] asientos){
    return asientos.length;
}

/*Contar total columnas  */
public int ContarColumnas (int [][] asientos) {
    if (asientos.length == 0) {
        return 0;
    }
    return asientos[0].length;
}

public int  contarFilasColumnaCoNumeroPar(int [] [] asientos) {
    int contarPares = 0;
     for (int i =0; i < asientos.length; i ++) {
     for (int j =0; j < asientos[i].length; j++) {
        if(asientos[i][j]%2 == 0) {
            contarPares++;
        }
    }
}
return contarPares;

}


public int  contarFilasColumnaCoNumeroImpar(int [] [] asientos) {
    int contarImpares = 0;
     for (int i =0; i < asientos.length; i ++) {
     for (int j =0; j < asientos[i].length; j++) {
        if(asientos[i][j]%2 == 1) {
            contarImpares++;
        }
    }
}
return contarImpares;

}

public int  contarFilasColumnaCoNumeroNegativos(int [] [] asientos) {
    int contarNegativos = 0;
     for (int i =0; i < asientos.length; i ++) {
     for (int j =0; j < asientos[i].length; j++) {
        if(asientos[i][j] < 0) {
           contarNegativos++;
        }
    }
}
return contarNegativos;

}


public static void main (String [] args) {
 Cine cinesito = new Cine(50);

 int [][] asientos = {
    {1,2,3,4,5,0},
    {6,7,8,0,10,11},
    {0,12,13,14,15,0},
    {16,0,18,19,20,21},
    {-22,0,-24,25,-26,-27},

};
   
System.out.println("Almacenar : " + cinesito.Almacenar(asientos));
System.out.println("Contar filas con 0: " + cinesito.Contarfilas0(asientos));
System.out.println("Contar columnas con 0: " + cinesito.Contarcolumnascon0(asientos));
System.out.println("Minimo:  " + cinesito.MinimoAsientos(asientos));
System.out.println("Maximo: " + cinesito.MaximoAsientos(asientos));
System.out.println("Promdio: " + cinesito.PromedioAsientos(asientos));
System.err.println("Total filas: " + cinesito.ContarFilas(asientos));
System.out.println("Total columnas :" + cinesito.ContarColumnas(asientos));
System.out.println("Contar pares :" + cinesito.contarFilasColumnaCoNumeroPar(asientos));
System.out.println("Contar impares:" + cinesito.contarFilasColumnaCoNumeroImpar(asientos));
System.out.println("Contar negativos:" + cinesito.contarFilasColumnaCoNumeroNegativos(asientos));


}

}
