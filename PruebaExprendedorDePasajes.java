package TestExpendedor;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
public class PruebaExpendedorDePasajes {

@Test
public void venderpasajes () {
ExpendedorDePasajes expe = new ExpendedorDePasajes(150);
int vender = (int ) expe.venderPasaje(100);
assertEquals(15000, vender);

}

@Test
public void movimiento1 () {
ExpendedorDePasajes expe = new ExpendedorDePasajes(150);
int vender1 = (int ) expe.venderPasaje(30);
int vender2 = (int ) expe.venderPasaje(50);
int pasajes = (int) expe.venderPasajes(vender1, vender2);
assertEquals(4502,pasajes); 

}


@Test
public void contamosCuantosVendimos() {
ExpendedorDePasajes expe = new ExpendedorDePasajes(150);
int vender1 = (int ) expe.venderPasaje(30);
int vender2 = (int ) expe.venderPasaje(50);
int Cotarvendidos = (int) expe.contarPasajesVendidos();
assertEquals (2, Cotarvendidos);

}

@Test
public void DistanciaRealizadas() {
ExpendedorDePasajes expe = new ExpendedorDePasajes(150);
int vender1 = (int ) expe.venderPasaje(30);
int vender2 = (int ) expe.venderPasaje(50);
int distancia = (int) expe.obtenerDistanciaMaxima();
assertEquals (50, distancia);

}

@Test
public void promedioDistancia() {
ExpendedorDePasajes expe = new ExpendedorDePasajes(150);
int vender1 = (int ) expe.venderPasaje(30);
int vender2 = (int ) expe.venderPasaje(50);
int promedio = (int) expe.calcularDistanciaPromedio();
assertEquals (25, promedio);



}
@Test 
public void ventasTotalos () {
ExpendedorDePasajes expe = new ExpendedorDePasajes(150);
int vender1 = (int ) expe.venderPasaje(30);
int vender2 = (int ) expe.venderPasaje(50);
int vender3 = (int ) expe.venderPasaje(40);
int vender4 = (int ) expe.venderPasaje(20);
int VentaTotal = (int ) expe.contarPasajesVendidos();
assertEquals(4, VentaTotal);

}

@Test 
public void ventasTotalesVerdadero4 () {
ExpendedorDePasajes expe = new ExpendedorDePasajes(150);
int vender1 = (int ) expe.venderPasaje(30);
int vender2 = (int ) expe.venderPasaje(50);
int vender3 = (int ) expe.venderPasaje(40);
int vender4 = (int ) expe.venderPasaje(20);
int VentaTotal = (int ) expe.contarPasajesVendidos();
assertEquals(4, VentaTotal);
assertTrue (VentaTotal > 3);

}
@Test 
public void ventasTotalesfalsosies3 () {
ExpendedorDePasajes expe = new ExpendedorDePasajes(150);
int vender1 = (int ) expe.venderPasaje(30);
int vender2 = (int ) expe.venderPasaje(50);
int vender3 = (int ) expe.venderPasaje(40);
int vender4 = (int ) expe.venderPasaje(20);
int VentaTotal = (int ) expe.contarPasajesVendidos();
assertEquals(4, VentaTotal);
assertFalse(VentaTotal < 4);

}

@Test
public void venderpasajeEsFalsoElPrecioesde50 () {
ExpendedorDePasajes expe = new ExpendedorDePasajes(150);
int vender = (int ) expe.venderPasaje(100);
assertFalse(vender < 50);

}

}
