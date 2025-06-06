package MapaTest;
public class MapaDeHumedad {

/* Se construya a partir de las dimensiones del terreno. */
private int dimension;
private double[][] Humedad;

public MapaDeHumedad() {
if (dimension > 0 && dimension <= 20){
    this.dimension = dimension;
}
}
/*Almacene las muestras de humedad. */
public int almacenarHumedad ( double [][] humedad) {
    for(int i = 0; i < humedad.length; i++){
    for(int j = 0; j < humedad[i].length; j++){
        return humedad.length;
    }
    
}
return 0;
}


/*Calcule la humedad promedio del terreno. */

public double promedioTerreno ( double [][] dimension){
   double promedio = 0;
     for(int i = 0; i < dimension.length; i++){
    for(int j = 0; j < dimension[i].length; j++){
        promedio += dimension[i][j];
}

}
return promedio/dimension.length *100;

}

/*Busque el mínimo valor de humedad */
public double minimoHumedad ( double [][] humedad) {
   double minimo = humedad [0][0];
       for(int i = 0; i <  humedad.length; i++){
       for(int j = 0; j <  humedad[i].length; j++){
        if (humedad[i][j] < minimo) {
        minimo = humedad[i][j] ;     
    
        }

     }
}
 return minimo;

}

/*Busque el máximo valor de humedad. */

public double maximoHumedad ( double [][] humedad) {
    double maximo = humedad [0][0];
       for(int i = 0; i <  humedad.length; i++){
       for(int j = 0; j <  humedad[i].length; j++){
        if (humedad[i][j] >maximo) {
       maximo = humedad[i][j] ;     
    
        }

     }
}
 return maximo;

}


/*Calcular el promedio de humedad del contorno del terreno. */
public double promedioContorno ( double [][]humedad) {
    double promedioContorno = 0;

      for(int i = 0; i <  humedad.length; i++){
       for(int j = 0; j <  humedad[i].length; j++){
         promedioContorno += humedad[i][j];
}
}
return promedioContorno / humedad.length;

 }

/*Contar la cantidad de muestras que se encuentran en un rango de valores indicados. */
public int cantidadMuestras ( double [][] humedad, double desde, double hasta) {
    int cantidad = 0;
          for(int i = 0; i <  humedad.length; i++){
       for(int j = 0; j <  humedad[i].length; j++){
         if (humedad[i][j] >= desde && humedad[i][j] <= hasta){
            cantidad++;
   }}
 }

return cantidad;

}


public static void main (String [] args){
    double [][] dime = {
    {1,2,3,4,5},
    {6,7,8,9,10},
    {1,2,3,4,5},
    {6,7,8,9,10},
};

MapaDeHumedad mapa = new MapaDeHumedad();



double [][] hume = {
    {1,2,3,4,5},
    {6,7,8,9,10},
    {11,12,13,14,15},
    {16,17,18,19,20},
};



System.out.println("Almacenar: " + mapa.almacenarHumedad(hume));
System.out.println("Promedio terreno:" + mapa.promedioTerreno(dime));
System.out.println("Minimo humedad: " + mapa.minimoHumedad(hume));
System.out.println("Maximo humedad: " + mapa.maximoHumedad(hume));
System.out.println("Promedio contorno:" + mapa.promedioContorno(hume));
System.out.println("Cantidad Muestras: " + mapa.cantidadMuestras(hume, 1, 10));







}




}
