

/**
 * Un Estacionamiento con cierta cantidad de lugares disponibles
 */
public class Estacionamiento4 {
private int cantidadDeLugares;
private int [] lugareslibres = {50};
private int [] cantidad = {50};
private int ocupar;
private int desocupar;
private int cantidadDeVecesUsadas;

private int [] veces={10};

 private boolean[] estaOcupado ; 
	/**
	 * Se construye con la cantidad de lugares disponibles
	 * @param cantidadDeLugares
	 * @throws Error si la cantidad no es válida
	 * @post Se construye el estacionamiento
	 */
	public Estacionamiento4(int cantidadDeLugares) {
       if (cantidadDeLugares > 0 && cantidadDeLugares < 50) {
            this.cantidadDeLugares = cantidadDeLugares;
            this.lugareslibres = new int[cantidadDeLugares];
            this.cantidad = new int[cantidadDeLugares];
            this.estaOcupado = new boolean[cantidadDeLugares];
          
        }
    }
	
	/**
	 * Permite ocupar un lugar.
	 * @param lugar, indicado con números de 1 a cantidadDeLugares
	 * @throws Error si el lugar no es válido
	 * @throws Error si el lugar ya está ocupado
	 * @pre el lugar existe y está desocupado
	 * @post se ocupa el lugar
	 */
	public void ocupar(int lugar) {
       // for(int i = 0; i < cantidad.length; i++){
            if(lugar > 0  && lugar <=  cantidadDeLugares && !estaOcupado[lugar - 1]){ 
               lugareslibres[lugar-1] = ocupar;
               estaOcupado[lugar - 1] = true;
               cantidad[lugar - 1]++;
                ocupar++;
                
            }
               cantidadDeVecesUsadas++;
              
        }


	

	/**
	 * Permite desocupar un lugar.
	 * @param lugar, indicado con números de 1 a cantidadDeLugares
	 * @throws Error si el lugar no es válido
	 * @throws Error si el lugar ya está desocupado
	 * @pre el lugar existe y está ocupado
	 * @post se desocupa el lugar
	 */
	public void desocupar(int lugar) {
             if(lugar > 0 && lugar <= cantidadDeLugares && estaOcupado[lugar - 1]){
                estaOcupado[lugar - 1] = false;
                lugareslibres[lugar-1] = desocupar;
                cantidad[lugar - 1]++;
               desocupar ++;
               cantidadDeVecesUsadas--;
           
             }

            }

	
	/**
	 * Permite conocer el estado de un lugar.
	 * @param lugar, indicado con números de 1 a cantidadDeLugares
	 * @throws Error si el lugar no es válido
	 * @return si el lugar está ocupado o no
	 */
	public boolean estaOcupado(int lugar) {
       if(lugar > 0 && lugar <= cantidadDeLugares){
          
        return estaOcupado[lugar-1];
		} else {
            return false;
        }
      }
	
	/**
	 * @return el porcentaje de ocupación actual
	 */
	public double porcentajeOcupados() {
		double TotalOcupados = 0;
           for(int i = 0; i < cantidad.length; i++){
            TotalOcupados += cantidad[i];
}

 return TotalOcupados/cantidad.length * 100;
}
	/**
	 * Permite conocer las veces que se utilizó un lugar
	 * @param lugar, indicado con números de 1 a cantidadDeLugares
	 * @return cuántas veces se utilizó dicho lugar
	 */
public int vecesQueSeUso(int lugar) {
   
   if (lugar > 0 && lugar <= cantidadDeLugares) {
           lugareslibres[lugar - 1] = ocupar;
               return cantidad[lugar - 1];
    } else {
        return ocupar;
           
    }}
       
 
	/**
	 * Permite conocer cuántos lugares se usaron más de X veces
	 * @param veces
	 * @throws Error si veces no es un valor válido
	 * @return la cuenta de lugares que cumplen la condición
	 */
	public int lugaresQueSeUsaronMasDeTantasVeces(int veces) {
        if(veces > 0 && veces < cantidadDeLugares){
            lugareslibres[ veces - 1] = cantidadDeVecesUsadas;
    
        }
      return veces;
      }
   





public static void main(String[] args) {
    
    Estacionamiento4 estate = new Estacionamiento4(5);
    int [] lugar = {1,2,3,4,5};
       
   
  // ocupar lugares
    estate.ocupar(1);
    estate.ocupar(2);
    estate.ocupar(3);
    estate.ocupar(4);
    estate.ocupar(5);
  
      
      // desocupar lugares
    estate.desocupar(2);
    estate.desocupar(4);
      // Verificar estado de lugares
    System.out.println("Lugar 1 está ocupado: " + estate.estaOcupado(1));
    System.out.println("Lugar 2 está ocupado: " + estate.estaOcupado(2));
    System.out.println("Lugar 3 está ocupado: " + estate.estaOcupado(3));
    System.out.println("Lugar 4 está ocupado: " + estate.estaOcupado(4));
    System.out.println("Lugar 5 está ocupado: " + estate.estaOcupado(5));
    // despcupados
    System.out.println("Lugar 1 está desocupado: " + estate.estaOcupado(1));
    System.out.println("Lugar 2 está desocupado: " + estate.estaOcupado(2));
    System.out.println("Lugar 3 está desocupado: " + estate.estaOcupado(3));
    System.out.println("Lugar 4 está desocupado: " + estate.estaOcupado(4));
    System.out.println("Lugar 5 está desocupado: " + estate.estaOcupado(5));
    
    
     
    System.out.println("Lugar 1 se utilizó: " + estate.vecesQueSeUso(1) + " veces");
    System.out.println("Lugar 2 se utilizó: " + estate.vecesQueSeUso(2) + " veces");
    System.out.println("Lugar 3 se utilizó: " + estate.vecesQueSeUso(3) + " veces");
    System.out.println("Lugar 4 se utilizó: " + estate.vecesQueSeUso(4) + " veces");
    System.out.println("Lugar 5 se utilizó: " + estate.vecesQueSeUso(5) + " veces");
    

    System.out.println("Porcentaje: "+ estate.porcentajeOcupados()+ "%");
    
    
   
  // Verificar lugares que se usaron más de X veces
    System.out.println("Lugares que se usaron más de 1 vez: " + estate.lugaresQueSeUsaronMasDeTantasVeces(5));
   

}}
