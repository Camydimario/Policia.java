package PruebaTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebasCines {
   @Test
    public void testPrecioDiferentePorAsientos() {
         Cine cine = new Cine();
         double [][] c = {{1, 2, 3, 40, 50, 60}};
        // c.preciototal = 15.5; // Cambiamos el precio por asiento
         cine.butacas = c;
        double total = cine.contizarAsientosLibres(6);
        assertEquals(0, total, 0.001);
    }


   @Test
    public void testPrecio() {
         Cine cine = new Cine();
         double [][] c = {{0, 0, 1}, {0, 0, 0}};
         cine.butacas = c;
        double total = cine.contizarAsientosLibres(6);
        assertEquals(50, total, 0.001); 
    }




   @Test
    public void testPrecio2() {
         Cine cine = new Cine();
         double [][] c = {{1, 1, 1}, {1, 1, 0}};
         cine.butacas = c;
        double total = cine.contizarAsientosLibres(6);
        assertEquals(10, total, 0.001); 
    }



   @Test
    public void testPrecio3() {
         Cine cine = new Cine();
         double [][] c = {{1, 1, 1}, {1, 0, 0}};
         cine.butacas = c;
        double total = cine.contizarAsientosLibres(6);
        assertEquals(20, total, 0.001); 
    }

 @Test
    public void testPrecio4() {
         Cine cine = new Cine();
         double [][] c = {{1, 1, 1}, {1, 1, 1}};
         cine.butacas = c;
        double total = cine.contizarAsientosLibres(6);
        assertEquals(0, total, 0.001); 
    }


 @Test
    public void testPrecio5() {
         Cine cine = new Cine();
         double [][] c = {{0, 0, 0}, {0, 0, 0}};
         cine.butacas = c;
        double total = cine.contizarAsientosLibres(6);
        assertEquals(60, total, 0.001); 
    }


}
