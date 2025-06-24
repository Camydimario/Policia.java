package TestTeatro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PruebaTeatro {

@Test
public void testerFilas (){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
int resultado = (int) tea.ContarFilas(t);
assertEquals( 4, resultado);
}
@Test
public void testerColumnas (){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
int resultado = (int) tea.ContarColumnas(t);
assertEquals( 4, resultado);
}

@Test
public void testerfilas3 (){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
int resultado = (int) tea.contarFilasCon3(t);
assertEquals( 4, resultado);
}

@Test
public void testerColumnas2 (){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
int resultado = (int) tea.contarColumnasCon2(t);
assertEquals( 3, resultado);
assertTrue( resultado > 1);
}

@Test
public void testearLugaresOcupados(){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
 int ocupados = (int) tea.contarLugaresOcupados(t);
 assertEquals(5, ocupados);
 assertFalse( ocupados > 10); // dara false

}

@Test
public void testearLugaresLibres(){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
 int libres = (int) tea.contarLugaresLibres(t);
 assertEquals(3, libres);


}
@Test
public void testearminimo(){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
 
 assertEquals(0, tea.minimo(t));
 assertTrue(true);


}

@Test
public void testearMaximo(){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
 int maximo = (int) tea.maximo(t);
 assertEquals(4, maximo);
 assertTrue(maximo == 4);


}

@Test
public void testearpromedio(){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
 int promedio = (int) tea.promedio(t);
 assertEquals(6, promedio);
 assertFalse(promedio == 4);


}

@Test
public void testeardiagonal(){
    Teatro tea = new Teatro(16);
     int [][] t = {
           {1,2,3,0},
           {2,1,3,0},
           {3,2,1,4},
           {0,1,3,1},
  
 };
 tea.elteatroEsDiagonal(t);

 //assertFalse(promedio == 4);


}







}
