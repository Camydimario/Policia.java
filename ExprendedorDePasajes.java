//clase 
public class ExpendedorDePasajes {
//atributos
private double precioPorKm;
private int cantidadVendida;
private double distanciaMaxima;
private double ventaTotal;
//constructor
/* pre: Se establece el precio por kilometros para exprender el pasaje
post: el precio se evalua segun la distancia en kilometros a realizar  */   
public ExpendedorDePasajes(double precioPorKm){
 this.precioPorKm = precioPorKm;
 this.cantidadVendida = 0;
 this.distanciaMaxima = 0;
 this.ventaTotal = 0;


}
/*pre: La venta de los pasajes se calcula segun la distancia y el precio por kilometros
 * post: el precio total se calcula y se muestra en pantalla 
 */
public double venderPasaje(double distanciaEnKm){
    double precioTotal = this.precioPorKm *  distanciaEnKm;
    this.cantidadVendida++;
    if (distanciaEnKm > this.distanciaMaxima) {
        this.distanciaMaxima = distanciaEnKm;
    }
    this.ventaTotal += precioTotal;
    return precioTotal;

    
}
/*pre: La venta de los pasajes se calcula segun la distancia y la cantidad de pasajes
 * post: se calcula la cantidad de ventas de pasajes segun su distancia recorrida en kilometros*/

public double venderPasajes(int cantidad, double distanciaEnKm){
    this.cantidadVendida  += cantidad;
    if (distanciaEnKm > this.distanciaMaxima) {
        this.distanciaMaxima = distanciaEnKm;
    }
    
    return this.cantidadVendida;
   

}
/*Post: se cuenta la cantidad de pasajes vendidos */
    public int contarPasajesVendidos(){
        return this.cantidadVendida;
 
    }
/*Post: se obtiene la distancia maxima reccorrida */
    public double obtenerDistanciaMaxima(){

        return this.distanciaMaxima;

    }

    /*Post: se calcula la distancia pronedio  */
    public double calcularDistanciaPromedio(){
        return this.distanciaMaxima / this.cantidadVendida;

    }
/*post: Se calcula la venta total */
    public double calcularVentaTotal(){
        return this.ventaTotal;

    }

    public static void main(String[] args) {
        ExpendedorDePasajes expe = new ExpendedorDePasajes(150);

        System.out.println("Se realiza la venta de Pasajes segun sus km: " + expe.venderPasaje(50));
        System.out.println("Se venden los pasajes segun la cantidad y los km realizados: " + expe.venderPasajes(10, 550));

        System.out.println("La cantidad de pasajes vendidos es de : "+ expe.contarPasajesVendidos());
        System.out.println("La distancia maxima es de : "+ expe.obtenerDistanciaMaxima());

        System.out.println("La distanciapromedio es de : "+ expe.calcularDistanciaPromedio());

        
        System.out.println("La venta total es de : "+ expe.calcularVentaTotal());

}


}
