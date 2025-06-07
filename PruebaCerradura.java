package TestCerradura;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
public class PruebaCerradura {


@Test

public void cerraduraAbierta(){
  Cerradura cerradurita = new Cerradura(3541, 3);
  boolean abrir = cerradurita.abrir(3541);
  assertTrue(abrir);



}

@Test

public void cerraduraCerradura(){
Cerradura cerradurita = new Cerradura(3541, 3);
 cerradurita.cerrar();
 boolean cerrar = cerradurita.estaCerrada();
 assertTrue(cerrar);



}

@Test 
public void aperturasBuenasSon3(){
Cerradura cerradurita = new Cerradura(3541, 3);
boolean abrir1 = cerradurita.abrir(3541);
boolean abrir2 = cerradurita.abrir(3541);
boolean abrir3 = cerradurita.abrir(3541);
int contarAperturas = (int) cerradurita.contarAperturasExitosas();
assertTrue(abrir1);
assertTrue(abrir2);
assertTrue(abrir3);
assertEquals( 3, contarAperturas);
}

@Test
public void cerraduraBloqueada(){
Cerradura cerradurita = new Cerradura(3541, 3);
boolean abrir1 = cerradurita.abrir(3222);
boolean abrir2 = cerradurita.abrir(3221);
boolean abrir3 = cerradurita.abrir(3202);
int contarfallidas = (int) cerradurita.contarAperturasFallidas();
assertTrue(abrir1);
assertTrue(abrir2);
assertTrue(abrir3);
assertEquals( 0, contarfallidas);


}


}
