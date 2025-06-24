package TestTeatro;
public class Teatro {
private int cantidad;
private boolean diagonal = false;

public Teatro(int cantidad){

     if(cantidad > 0 && cantidad < 50){
            this.cantidad = cantidad;
    }
}

// contamos cuantas filas tiene el teatro

public int ContarFilas(int [][] butacas){
   return butacas.length;
}

// contamos cuantas columnas tiene el teatro
public int ContarColumnas( int [] [] butacas){
    if ( butacas.length == 0){
        return 0;
    }
    return butacas[0].length;
}

//contamos cuantas filas con 3 hay

public int contarFilasCon3 (int [][] butacas){
    int contarFilasCon3 = 0;
    for ( int i = 0; i < butacas.length; i ++){
        for( int j =0 ; j < butacas.length; j ++){
            if (butacas[i][j]==3){
                contarFilasCon3++;
            }
        }
    }
return contarFilasCon3;
}

public int contarColumnasCon2 ( int [][] butacas){

   int contarColumnasCon2 = 0;
    for ( int i = 0; i < butacas.length; i ++){
        for( int j =0 ; j < butacas.length; j ++){
            if (butacas[i][j]==2){
               contarColumnasCon2++;
            }
        }
    }
return contarColumnasCon2;
}


public int contarLugaresOcupados(int [][] butacas){
    int lugaresOcupados=0;
     for ( int i = 0; i < butacas.length; i ++){
        for( int j =0 ; j < butacas.length; j ++){
            if (butacas[i][j]==1){
                lugaresOcupados++;
}
        }

}
return lugaresOcupados;
}

public int contarLugaresLibres(int [][] butacas){
    int lugaresLibres=0;
     for ( int i = 0; i < butacas.length; i ++){
        for( int j =0 ; j < butacas.length; j ++){
            if (butacas[i][j]==0){
                lugaresLibres++;
}
        }

}
return lugaresLibres;
}

//sacamos el minimo 

public int minimo ( int [][] butacas){
    int minimo = butacas[0][0];
     for ( int i = 0; i < butacas.length; i ++){
        for( int j =0 ; j < butacas.length; j ++){
            if ( butacas[i][j] < minimo){
                minimo = butacas[i][j];
            }
}  }
return minimo;
    }

// buscar maximo 

public int maximo ( int [][] butacas){
    int maximo = butacas[0][0];
     for ( int i = 0; i < butacas.length; i ++){
        for( int j =0 ; j < butacas.length; j ++){
            if ( butacas[i][j] > maximo){
                maximo = butacas[i][j];
            }
}  }
return maximo;
    }


// buscar promedio

public double promedio (int [][] butacas){
    double suma =0;
       for ( int i = 0; i < butacas.length; i ++){
        for( int j =0 ; j < butacas.length; j ++){
            suma += butacas[i][j];
}
}
return suma / butacas.length;
}

// sacar porcentaje 

public double porcentaje ( int [][] butacas){
    double porcentaje = 0;
         for ( int i = 0; i < butacas.length; i ++){
        for( int j =0 ; j < butacas.length; j ++){
            porcentaje += butacas[i][j];
}
}
return porcentaje / butacas.length *100;

}

public void elteatroEsDiagonal (int [][] butacas ) {
      for ( int i = 0; i < butacas.length; i ++){
        for( int j =0 ; j < butacas.length; j ++){
            if ( i ==j){
                diagonal = diagonal && butacas[i][j] == 1;
            }
            else {
                diagonal = diagonal && butacas [i][j] == 0;
            }

}
}
}

public static void main ( String [] args){
 Teatro tea = new Teatro (16);
 int [][] t = {
  {1,2,3,0},
  {2,1,3,0},
  {3,2,1,4},
  {0,1,3,1},
  
 };
 
tea.elteatroEsDiagonal(t);

// contar filas
System.out.println("Cantidad De Filas: " + tea.ContarFilas(t));
//contar Columnas 
System.out.println("Cntidad de Columnas: " + tea.ContarColumnas(t));
//  contar filas con 3
System.out.println(("Cantidad de filas con 3: " + tea.contarFilasCon3(t) ));
// contar columnas con 2
System.out.println("Contar columnas con 2: " + tea.contarColumnasCon2(t));
// contar lugares ocupados
System.out.println("Lugares Ocupadods: " + tea.contarLugaresLibres(t));
//contar lugares libres
System.out.println("Lugares libres: " + tea.contarLugaresLibres(t));
// minimo del teatro
System.out.println("Minimo: " + tea.maximo(t));
// maximo del teatro 
System.out.println("maximo: " + tea.maximo(t));
// promedio del teatro 
System.out.println("Promedio: " + tea.promedio(t));
// porncetaje del teatro
System.out.println("Porcentaje: " + tea.porcentaje(t));

}




}
