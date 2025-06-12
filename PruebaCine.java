package TestCine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PruebaCine {


@Test
public void verificarFilasCon0 () {
     Cine cinesito = new Cine(50);
     int [][] a = {
    {1,2,3,0},
    {6,7,8,0},
    {0,12,13},
    
};
int resultado = cinesito.Contarfilas0(a);
assertEquals (3, resultado);

}


@Test
public void verificarColumnasCon0 () {
     Cine cinesito = new Cine(50);
     int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
};
int resultado = cinesito.Contarcolumnascon0 (a);
assertEquals (4, resultado);

}

@Test
public void verificarTotalFilas() {
     Cine cinesito = new Cine(50);
     int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
};
int resultado = cinesito.ContarFilas(a);
assertTrue(resultado == 3);
assertEquals(3, resultado);
}

@Test
public void verificarTotalColumnas() {
     Cine cinesito = new Cine(50);
     int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
};
int resultado = cinesito.ContarColumnas(a);
assertEquals(4, resultado);
assertFalse (resultado == 3);//verifica que no sea 3 que es falso
}

@Test
public void verificarAlmacenamiento() {
Cine cinesito = new Cine(50);
     int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
};
assertEquals(3, cinesito.Almacenar(a));
}

@Test 
public void VerificamosMaximo() {
Cine cinesito = new Cine(50);
     int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
};
int maximo = (int) cinesito.MaximoAsientos(a);
assertEquals(13, maximo);
}
@Test 
public void VerificamosQueElMaximoSeaMAYORa10() {
Cine cinesito = new Cine(50);
     int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
};
int maximo = (int) cinesito.MaximoAsientos(a);
assertEquals(13, maximo);
assertTrue( maximo >10); // verificamos que sea verdadero
}

@Test
public void verificamosElminimo(){
Cine cinesito = new Cine(50);
     int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
};
int minimo = (int) cinesito.MinimoAsientos(a);
assertEquals(0, minimo);
}

@Test
public void verificamosElminimoSea0(){
Cine cinesito = new Cine(50);
     int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
};
int minimo = (int) cinesito.MinimoAsientos(a);
assertTrue(minimo == 0);
}

@Test 
public void testeamosPromedio() {
Cine cinesito = new Cine(50);
    int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
}; 
assertEquals(15.0 , cinesito.PromedioAsientos(a), 0.15);
}

@Test 
public void testeamosPromedioFalso() {
Cine cinesito = new Cine(50);
    int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
}; 
assertEquals(15.0 , cinesito.PromedioAsientos(a), 0.15);
int falsedad = (int) cinesito.PromedioAsientos(a);
assertFalse(falsedad < 10); // verificamos que sea falso 
}


@Test 
public void testamosQueSoloParesSean4(){
Cine cinesito = new Cine(50);
    int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
}; 
int pares = cinesito.contarFilasColumnaCoNumeroPar(a);
assertEquals(8, pares);
assertTrue( pares > 7 ); // verificamos que sea verdadero
assertFalse( pares < 6); // verificamos que sea falso
}


@Test
public void verificamosQueSoloImparesSean3(){
Cine cinesito = new Cine(50);
    int [][] a = {
    {1,2,3,0},
    {6,0,8,0},
    {0,12,13},
    
};
int impares = cinesito.contarFilasColumnaCoNumeroImpar(a);
assertEquals(3, impares);
assertTrue( impares ==3);
}

@Test 
public void verificamosNegativos(){
Cine cinesito = new Cine(50);
    int [][] a = {
    {1,2,3,0},
    {6,0,-8,0},
    {0,12,13},
    
};
int negativo = cinesito.contarFilasColumnaCoNumeroNegativos(a);
assertEquals(1, negativo);
}

@Test
public void vacio (){
Cine cinesito = new Cine(50);
    int [][] a = {};
    
int vacio = cinesito.ContarFilas(a);
assertEquals( 0, vacio);

}

@Test 
public void movimiento (){
Cine cinesito = new Cine(50);
    int [][] a = {
    {1,2,3,0},
    {6,0,-8,0},
    {0,12,13},
    {0,15,16},
    {0,18,19},
    
};
assertEquals(5, cinesito.ContarFilas(a));
assertEquals(-8, cinesito.MinimoAsientos(a), -0.8);
assertEquals(12, cinesito.contarFilasColumnaCoNumeroPar(a));
assertEquals(1, cinesito.contarFilasColumnaCoNumeroNegativos(a));
int maximo =(int) cinesito.MaximoAsientos(a);
assertTrue( maximo > 10);
int falsedad = cinesito.Contarcolumnascon0(a);
assertFalse(falsedad < 4);

}

}
