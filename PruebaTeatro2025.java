package PruebaTeatro;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.Test;

public class TestTeatro {

@Test

public void testear(){
    Teatro teatrito = new Teatro(new Butacas[][] {
    {new Butacas(true),new Butacas(true),
    new Butacas(true),new Butacas(true),
    new Butacas(true),new Butacas(true),
    }});
    int resultado= teatrito.hallarButacasSinObstaculos();
    assertEquals(-1, resultado);
    
}
@Test
 public void testear2(){
    Teatro teatrito = new Teatro(new Butacas[][] {
    {new Butacas(false),new Butacas(false),
    new Butacas( false),new Butacas(false),
    new Butacas(false), new Butacas(false),
    }});

    int resultado= teatrito.hallarButacasSinObstaculos();
    assertEquals(1, resultado);
    
}
@Test
 public void testear3(){
    Teatro teatrito = new Teatro(new Butacas[][] {
    {new Butacas(true),new Butacas(true),
    new Butacas( false),new Butacas(false),
    new Butacas(false), new Butacas(false),
    }});

    int resultado= teatrito.hallarButacasSinObstaculos();
    assertEquals(-1, resultado);
    
}
@Test
 public void testear4(){
    Teatro teatrito = new Teatro(new Butacas[][] {
    {new Butacas(true),new Butacas(false),
    new Butacas( true),new Butacas(false),
    new Butacas(true), new Butacas(false),
    }});

    int resultado= teatrito.hallarButacasSinObstaculos();
    assertEquals(1, resultado); // da -1
    
}
@Test
 public void testear5(){
    Teatro teatrito = new Teatro(new Butacas[][] {
    {new Butacas(true),new Butacas(false),
    new Butacas(true), new Butacas(false),
    }});

    int resultado= teatrito.hallarButacasSinObstaculos();
    assertEquals(1, resultado); // da -1
    
}



@Test
 public void testearVerdad(){
    Teatro teatrito = new Teatro(new Butacas[][] {
    {new Butacas(true),new Butacas(true),
    new Butacas( false),new Butacas(false),
    new Butacas(false), new Butacas(false),
    }});

    int verdad = teatrito.hallarButacasSinObstaculos();
    assertTrue(verdad == -1);
    
}


@Test
 public void testearfalso(){
    Teatro teatrito = new Teatro(new Butacas[][] {
    {new Butacas(true),new Butacas(true),
    new Butacas( false),new Butacas(false),
    new Butacas(false), new Butacas(false),
    }});

    int falso = teatrito.hallarButacasSinObstaculos();
    assertFalse(falso > 1);
    
}


}
    
    

