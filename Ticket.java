//clase

public class Ticket {
    
     private int importe;
     private int cantidadProductos;
     
    /**
     * post: el Ticket se inicializa con importe 0.
     */
 //constructor   
    public Ticket() { 
     
        this.importe = 0;
        this.cantidadProductos = 0;
    }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de
     *       de productos y su precio unitario.
     */
    public void agregarItem(int cantidad, double precioUnitario) {
       
        if (cantidad > 0  && precioUnitario >0 ) {
           double suma = cantidad * precioUnitario;
             this.importe +=suma;
             this.cantidadProductos += cantidad;
            }    
    }

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) { 
       
        if(porcentaje > 0 && porcentaje < 100 ){
            double descuento =  this.importe * (porcentaje /100);
            this.importe -= descuento;
        }


    }

    /**
     * post: devuelve el importe acumulado hasta el momento,
     *       sin cerrar el Ticket.
     */
    public double calcularSubtotal() { 
        return importe;

    }
	
    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() { 
        return importe;
          
    }


    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() {
        return cantidadProductos;
   
 } 
 public static void main(String[] args) {
    Ticket tickesito = new Ticket();
    // agregamos item 
    tickesito.agregarItem(10, 15);
    tickesito.agregarItem(1, 25);
    tickesito.agregarItem(4, 20);
    tickesito.agregarItem(7, 30);
  // aplicamos descuentos
   tickesito.aplicarDescuento(15);

  // calculamos el sub total 
   System.out.println(("El importe subtotal seria de: " + tickesito.calcularSubtotal()));

    // calculamos el total 
   System.out.println(("El importe total seria de: " + tickesito.calcularTotal()));

   // calculamos  la cantidad de productos
   System.out.println(("La cantidad de productos es de: " + tickesito.contarProductos()));
    }


}
