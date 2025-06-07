package TestNota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class PruebaNota {

@Test
public void NotaAprobado () {
 Nota miNota = new Nota(7);
 assertTrue(miNota.aprobado());


 //boolean resultado = miNota.aprobado();
 //Assert.assertEquals(resultado, true);


}

@Test
public void NotaDesaprobado () {
 Nota miNota = new Nota(2);
 assertTrue(miNota.desaprobado());


 //boolean resultado = miNota.aprobado();
 //Assert.assertEquals(resultado, true);


}
/**
 * 
 */
@Test
public void NotaEsperada () {
 Nota miNota = new Nota(10);
 int resultado = miNota.obtenerValor();
 assertEquals(10, resultado);

}





}


