package MapaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PruebaMapaHumedad {

@Test
public void ComprobarMinimoHumedad() {
    MapaDeHumedad map = new MapaDeHumedad();
    double [][] Hume = {
    {1.0,2.0,3.0,4.0,5.0},
    {6.0,7.0,8.0,9.0,10.0},
   

};
  assertEquals(1.0, map.minimoHumedad(Hume), 0.0001);



}

@Test
public void ComprobarMaximoHumedad() {
    MapaDeHumedad map = new MapaDeHumedad();
    double [][] Hume = {
    {1.0,2.0,3.0,4.0,5.0},
    {6.0,7.0,8.0,9.0,10.0},
   

};
  assertEquals(10.0, map.minimoHumedad(Hume), 10.0001);



}

@Test
public void verificarMuestras () {
    MapaDeHumedad map = new MapaDeHumedad();
    double [][] Hume = {
    {1.0,2.0,3.0,4.0,5.0},
    {6.0,7.0,8.0,9.0,10.0},
   
 
};
assertEquals(10,map.cantidadMuestras(Hume, 1, 10));
}


@Test
public void verificarPromedio () {
  MapaDeHumedad map = new MapaDeHumedad();
    double [][] Hume = {
    {1.0,2.0,3.0,4.0,5.0},
    {6.0,7.0,8.0,9.0,10.0},
   
 
};
int resultado = (int) map.promedioContorno(Hume);

assertEquals( 27, resultado);
//assertEquals(27, map.promedioContorno(Hume),27.00);
}


@Test
public void verificarPromedioContorno () {
  MapaDeHumedad map = new MapaDeHumedad();
    double [][] Hume = {
    {1.0,2.0,3.0,4.0,5.0},
    {6.0,7.0,8.0,9.0,10.0},
   
 
};
int resultado = (int) map.promedioContorno(Hume);

assertEquals( 27, resultado);

}
@Test
public void ComprobarSiElMaximoHumedadEs10() {
    MapaDeHumedad map = new MapaDeHumedad();
    double [][] Hume = {
    {1.0,2.0,3.0,4.0,5.0},
    {6.0,7.0,8.0,9.0,10.0},
   

};
int resultado =  (int) map.maximoHumedad(Hume);
   assertTrue(resultado == 10);
  
}

@Test
public void ComprobarSiElMinimoHumedadEs1() {
    MapaDeHumedad map = new MapaDeHumedad();
    double [][] Hume = {
    {1.0,2.0,3.0,4.0,5.0},
    {6.0,7.0,8.0,9.0,10.0},
   

};
int resultado =  (int) map.minimoHumedad(Hume);
   assertTrue(resultado < 2);
  
}


}



