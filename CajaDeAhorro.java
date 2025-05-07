
//clase

public class CajaDeAhorro {
 /**
     * post: la instancia queda asignada al titular indicado
     *   	    y con saldo igual a 0.
     */
   public int saldo;
   public String titularDeLaCuenta ;
   public double depositar;
// constructor

     public CajaDeAhorro(String titularDeLaCuenta) { 
        this.titularDeLaCuenta =  titularDeLaCuenta;
        this.saldo = 0; 
            System.out.println("La cuenta no tiene saldo.");
        
     }
         
     
    /**
     * post: devuelve el nombre del titular de la Caja de Ahorro.
     */
    public String obtenerTitular() { 
        return titularDeLaCuenta;
    }

    /**
     * post: devuelve el saldo de la Caja de Ahorro.
     */
    public double consultarSaldo() {
        return saldo;
     }

    /**
     * pre : monto es un valor mayor a 0.
     * post: aumenta el saldo de la Caja de Ahorro según el monto
     *       depositado.  
     */
    public void depositar(double monto) {
        if(monto > 0 ) {
           // double depositar = saldo + monto;
            saldo += monto;
        }
     }
      
     
    /**
     * @monto: la cantidad de dinero a extraer de la cuenta.
     * pre : monto es mayor a 0 y menor o igual que el saldo de la
     *       Caja de Ahorro.
     * post: disminuye el saldo de la Caja de Ahorro según el monto
     *       extraído.
     */
    public void extraer(double monto) {
        if(monto > 0 & monto <= saldo) {
            //double extraer = saldo - monto;
            saldo -= monto;
            
        }
         
    }

     public static void main(String[] args) {
     CajaDeAhorro cajita = new CajaDeAhorro("juan");
    
     //Mostrar el titular de la cuenta 
     System.out.println("El titular de la cuenta es " + cajita.obtenerTitular());

     //mostrar el saldo actual de la cuenta 
     System.out.println("El saldo actual es de  " + cajita.consultarSaldo());

     //Se deposita en la cuenta
     cajita.depositar(1000);

     //Se muestra el saldo despues de depositar
     System.out.println("El saldo actual es de  " + cajita.consultarSaldo());

     //Se extrae saldo de la cuenta
     cajita.extraer(700);
     //Se muestra el saldo despues de extraer
     System.out.println("El saldo actual es de  " + cajita.consultarSaldo());
     

}


}
