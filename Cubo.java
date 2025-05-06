//clase

class Cubo {
    double longitudLado =0;
    double areaCara = 0;
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
//constructor  
     public Cubo (double longitudLado) { 
      if (longitudLado > 0){
         this. longitudLado = longitudLado;
      } 

     }
     

     //metodos 
     /**
     * post: devuelve la longitud de todos los lados del cubo
     */   
    public double obtenerLado() { 
        return longitudLado;
        
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double cambiarlado) { 
    
     if (cambiarlado > 0 ) {
        this. longitudLado = cambiarlado;
     } else { 
        System.out.println( "El lado es invalido");
     }

     }
     

    
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() {
        return Math.pow(longitudLado, 2);

     }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
         if (areaCara > 0) {
            this.longitudLado = Math.sqrt(areaCara);
    }


     }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
        return Math.pow(longitudLado, 3);
     }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) {
        if (volumen > 0) {
            this.longitudLado = Math.cbrt(volumen);
        } else {
            System.out.println("El volumen es invalido");
        }
    }

    public static void main(String[] args) {
        // Crear una nota con valor inicial 7
       
       Cubo cubito = new Cubo(1);
       System.out.println("La longitud del cubo es de "+ cubito.longitudLado);

       System.out.println("El area del cubo es de " + cubito.obtenerAreaCara());
       System.out.println("El volumen del Cubo es de " + cubito.obtenerVolumen());
       cubito.cambiarLado(10);
       System.out.println("Se ha cambiado el lado del cubo");

       cubito.cambiarAreaCara(3);
       System.out.println("Se ha cambiado el area de la cara");

       cubito.cambiarVolumen(7);
       System.out.println("Se ha cambiado el volumen del cubo");

      
    


}

}
