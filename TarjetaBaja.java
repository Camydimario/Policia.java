// clase


public class TarjetaBaja {
    double saldoInicial=0;
    
    private int  ViajeEnColectivo = 0;
    private int ViajeEnSubte = 0;
    /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
// constructor

     public TarjetaBaja(double saldoInicial) { 
       this.saldoInicial = saldoInicial;


    }
// metodos

    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() { 
        return this.saldoInicial;
    } 

    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) { 
        this.saldoInicial += monto;
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
     */
    public void pagarViajeEnColectivo() { 
   double ViajeEnColectivo = 21.50;     
         if (this.saldoInicial >=  ViajeEnColectivo  ){
            this.saldoInicial -=  21.50;  
             this.ViajeEnColectivo++;
        }
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     */
    public void pagarViajeEnSubte() { 
    double ViajeEnSubte = 19.50;  
        if (this.saldoInicial >= ViajeEnSubte){
            this.saldoInicial -= 19.50;
            this.ViajeEnSubte ++ ;
        }

    }

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() { 
        return this.ViajeEnColectivo + this.ViajeEnSubte;
   
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() { 
        return this.ViajeEnColectivo;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() { 
        return this.ViajeEnSubte;
    }
    public static void main(String[] args) {
        // Crear una nota con valor inicial 7
        TarjetaBaja targetita = new TarjetaBaja(0);
       // mostrar el saldo inicial de la tarjeta
       System.out.println("El saldo inicial de la targeta es de " + targetita.obtenerSaldo());
        
       //cargar la tarjeta 
       targetita.cargar(99.50);
       //mostrar el saldo de la tarjeta 
       System.err.println("El saldo de la targeta es de " + targetita.obtenerSaldo());

       //Pagar el viaje en Colectivo 
       targetita.pagarViajeEnColectivo();
       targetita.pagarViajeEnColectivo();

       // Pagar el viaje en Subte 
       targetita.pagarViajeEnSubte();

       //Contar todos los viajes en Colectivo
       System.out.println("La cantidad de viajes en colectivo es de " + targetita.contarViajesEnColectivo());

       //Contar todos los viajes en Subte 
       System.out.println("La cantidad de viajes en subte es de " + targetita.contarViajesEnSubte());

       // Contar todos los viajes
       System.out.println("El total de los viajes es de " + targetita.contarViajes());
      
        //Mostramos el saldo que quedo 
        System.out.println("El saldo inicial de la targeta es de " + targetita.obtenerSaldo());
    }
}


