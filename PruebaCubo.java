package TestCubo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
public class PruebaCubo {


@Test
public void obtenerElLado() {
      Cubo cubito = new Cubo(5);
      int resultado = (int)cubito.obtenerLado();
      assertEquals(5, resultado);
}

@Test
public void lado5cambiarladoA2() {
     Cubo cubito = new Cubo(5);
     cubito.cambiarLado(2);
     int resultado = (int ) cubito.obtenerLado();
     assertEquals (2, resultado);

}

@Test
public void caraarea10CambiarCaraareaA5(){
    Cubo cubito = new Cubo(10);
    cubito.cambiarAreaCara(5);
    int resultado = (int) cubito.obtenerAreaCara();
        assertEquals (5, resultado);
}

@Test
public void VolumenEs6CambiarA12(){
       Cubo cubito = new Cubo(6);
       cubito.cambiarVolumen(12);
       int resultado = (int) cubito.obtenerVolumen();
          assertEquals (12, resultado);
}


@Test
public void validarLado() {
     Cubo cubito = new Cubo(6);
     int resultado = (int) cubito.obtenerLado();
     assertTrue(resultado < 10 );
}


}
