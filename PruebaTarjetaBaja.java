package TestTarjetaBaja;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class PruebaTarjetaBaja {

@Test

public void verificarSaldo() {
      TarjetaBaja targetita = new TarjetaBaja(10);
      int resultado = (int) targetita.obtenerSaldo();
      assertTrue ( resultado > 5);
    
  
}

@Test
public void saldo10Cargar5() {
      TarjetaBaja targetita = new TarjetaBaja(10);
      targetita.cargar(5);
      int resultado = (int) targetita.obtenerSaldo();
      assertEquals(15, resultado);

}

@Test 
public void saldo15PagarViajeDe9() {
 TarjetaBaja targetita = new TarjetaBaja(15);
 targetita.pagarViajeEnColectivo();
 int resultado = (int) targetita.obtenerSaldo();
 assertEquals(15, resultado);

}

@Test 
public void movimiento() {
 TarjetaBaja targetita = new TarjetaBaja(50.5);
targetita.cargar(5);
 targetita.pagarViajeEnColectivo();
 int resultado = (int) targetita.obtenerSaldo();
 assertEquals(34, resultado);

}

@Test
public void movimiemto2 () {
 TarjetaBaja targetita = new TarjetaBaja(50.5);
targetita.cargar(5);
 targetita.pagarViajeEnSubte();
 int resultado = (int) targetita.obtenerSaldo();
 assertEquals(36, resultado);

}

@Test
public void movimiento3() {

 TarjetaBaja targetita = new TarjetaBaja(50.5);
targetita.cargar(5);
targetita.pagarViajeEnSubte();
targetita.pagarViajeEnColectivo();
int resultado = (int) targetita.obtenerSaldo();
 assertEquals(14, resultado);

}


@Test
public void movimientoContarViajes() {

TarjetaBaja targetita = new TarjetaBaja(50.5);
targetita.cargar(5);
targetita.pagarViajeEnSubte();
targetita.pagarViajeEnColectivo();
int contar = (int) targetita.contarViajes();
 assertEquals(2,contar);

}

@Test
public void contarQueviaje3VecesEnColectivo(){
    TarjetaBaja targetita = new TarjetaBaja(100);
    targetita.pagarViajeEnColectivo();
    targetita.pagarViajeEnColectivo();
    targetita.pagarViajeEnColectivo();
    int contamos = (int) targetita.contarViajesEnColectivo();
    assertEquals (3, contamos);
}
@Test
public void contarQueviaje5VecesEnSubte(){
    TarjetaBaja targetita = new TarjetaBaja(100);
    targetita.pagarViajeEnSubte();
    targetita.pagarViajeEnSubte();
    targetita.pagarViajeEnSubte();
    targetita.pagarViajeEnSubte();
    targetita.pagarViajeEnSubte();
    int contamos = (int) targetita.contarViajesEnSubte();
    assertEquals (5, contamos);
}

@Test 

public void movimiento5(){
TarjetaBaja targetita = new TarjetaBaja(100);

targetita.pagarViajeEnSubte();
targetita.pagarViajeEnSubte();
targetita.pagarViajeEnSubte();
int contamos = (int) targetita.contarViajesEnSubte();
int resultado = (int) targetita.obtenerSaldo();
assertEquals(3, contamos);
assertEquals(41, resultado);



}


}

