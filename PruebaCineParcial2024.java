package PruebaCine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testCine {


@Test
public void testearAsientoslibres(){
      Cine cine = new Cine();
      int[][] c = {{1, 2, 3}, {4, 5, 6}};
     cine.butacas = c;
     //cine.estaocupado = true;
     int esperado = 0;
     int resultado = (int) cine.contizarAsientosLibres(6);
    
     assertEquals(esperado, resultado);

}
@Test
public void testearAsientosOcupados(){
      Cine cine = new Cine();
      int[][] c = {{1, 2, 3}, {0, 0, 0}}; // La matriz tiene un asiento libre (0) y varios asientos ocupados (1, 2, 3, 4, 5)
      cine.butacas = c;
     int esperado = 3; // La cantidad de asientos libres es 1
     int resultado = (int) cine.contizarAsientosLibres(6);
    
     assertEquals(esperado, resultado);
}


@Test
public void testearAsientosOcupadosVERDADERO(){
      Cine cine = new Cine();
      int[][] c = {{1, 2, 3}, {0, 0, 0}}; // La matriz tiene un asiento libre (0) y varios asientos ocupados (1, 2, 3, 4, 5)
      cine.butacas = c;
     //int esperado = 3; // La cantidad de asientos libres es 1
     int resultado = (int) cine.contizarAsientosLibres(6);
    
 assertTrue(resultado == 3);
}

@Test
public void testearAsientosOcupadosFALSO(){
      Cine cine = new Cine();
      int[][] c = {{1, 2, 3}, {0, 0, 0}}; // La matriz tiene un asiento libre (0) y varios asientos ocupados (1, 2, 3, 4, 5)
      cine.butacas = c;
     //int esperado = 3; // La cantidad de asientos libres es 1
     int resultado = (int) cine.contizarAsientosLibres(6);
    
 assertFalse(resultado > 4);
}


@Test
public void testearAsientos(){
      Cine cine = new Cine();
      int[][] c = {{0, 0, 0}, {0, 0, 0}}; // La matriz tiene un asiento libre (0) y varios asientos ocupados (1, 2, 3, 4, 5)
     cine.butacas = c;
    
     int resultado = (int) cine.contizarAsientosLibres(6);
    assertEquals(6, resultado);
}


@Test
public void testearAsientos2(){
      Cine cine = new Cine();
      int[][] c = {{1, 0, 0}, {0, 0, 0}}; // La matriz tiene un asiento libre (0) y varios asientos ocupados (1, 2, 3, 4, 5)
     cine.butacas = c;
    assertEquals(5, (int) cine.contizarAsientosLibres(6));
}




}   
