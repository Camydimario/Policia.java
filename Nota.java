

public class Nota {
 /*** pre : valorInicial está comprendido entre 0 y 10.
  * * post: inicializa la Nota con el valor indicado.
*/
int valorInicial = 0;


//constructor
public Nota(int valorInicial) { 
    if (valorInicial < 0 || valorInicial > 10){} //opcional
    this. valorInicial = valorInicial;
}  

//metodos

  /**
  * post: devuelve el valor numérico de la Nota,
   *       comprendido entre 0 y 10.
 */
 public int obtenerValor() { 
     return this. valorInicial;       
}
 /**
 * post: indica si la Nota permite o no la aprobación.
 */
public boolean aprobado() { 
   return valorInicial > 4; 
     
    
}
        
/**
  * post: indica si la Nota implica desaprobación.
 */
public boolean desaprobado() { 
          return !aprobado();  
    // o  return ValorInicial <4
    
}
 /**
     * pre : nuevoValor está comprendido entre 0 y 10.
     * post: modifica el valor numérico de la Nota, cambiándolo
     *       por nuevoValor, siempre y cuando nuevoValor sea superior al
     *       valor numérico actual de la Nota.
     */
    public void recuperar(int nuevoValor) { 
     
     if (nuevoValor >= 0 && nuevoValor <= 10 && nuevoValor > this.valorInicial){
        this.valorInicial = nuevoValor;
    }
     }
    

        

    public static void main(String[] args) {
        // Crear una nota con valor inicial 7
        Nota miNota = new Nota(7);
        
        // Mostrar el valor de la nota
        System.out.println("Valor de la nota: " + miNota.obtenerValor());
      
        // Verificar si la nota es aprobada
        System.out.println("¿Esta Aprobado? " + miNota.aprobado());
        
        // Verificar si la nota es desaprobada
        System.out.println("¿Esta Desaprobado? " + miNota.desaprobado());
       
        // Intentar recuperar con un valor menor (no debería cambiar)
        miNota.recuperar(10);
        System.out.println("Después de recuperar con 10: " + miNota.obtenerValor());
       
//-----------------------------------------------------------------------------------------------//
    /// nota baja  con valor inicial 3
    Nota miNota2 = new Nota(3);
    System.out.println("Valor de la nota: " + miNota2.obtenerValor());
    // verificamos si esta aprobada
    System.out.println("¿Esta Aprobado? " + miNota2.aprobado());
    // verificamos si esta desaprobada
    System.out.println("¿Esta Desaprobado? " + miNota2.desaprobado());
    
     // Intentar recuperar con un valor menor (no debería cambiar)
     miNota.recuperar(5);
     System.out.println("Después de recuperar con 5: " + miNota2.obtenerValor());

    
    }

}


