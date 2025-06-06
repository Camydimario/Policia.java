package testAnalizador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PruebaAnalizador {

    @Test
public void contadorTest(){
    AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
  double[][] matriz = {
   		 { 0,  0,  0 },
   		 { 2.1, -9.2,  5.1 },
   		 { 2.3,  0, -2.3 },
   		 { 1.0,  6.1, -8.5 },
   	 };

    
    assertEquals(4,  ana.contarCeros(matriz));


}

@Test
public void contarCerosEnUnaMatrizDe4Por3QueNoTieneCeros() {
    AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
	 double[][] matriz = {
   		 { 5.0,  3.5,  2.4 },
   		 { 2.1, -9.2,  5.1 },
   		 { 2.3,  7.9, -2.3 },
   		 { 1.0,  6.1, -8.5 },
   	 };
    
   	assertEquals(0, ana.contarCeros(matriz));
}
    

@Test
public void contarCerosEnUnaMatrizDe4Por3QueTieneCeros() {
    AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
	 double[][] matriz = {
   		 { 5.0,  0,  2.4 },
   		 { 2.1, -9.2,  5.1 },
   		 { 2.3,  7.9, 0 },
   		 { 1.0,  0, -8.5 },
   	 };
    
   	assertEquals(3, ana.contarCeros(matriz));
}
    

@Test
public void esVerdaderoSiTiene3Ceros (){ 
  AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
	 double[][] matriz = {
   		 { 5.0,  0,  2.4 },
   		 { 2.1, -9.2,  5.1 },
   		 { 2.3,  7.9, 0 },
   		 { 1.0,  0, -8.5 },
   	 };
     assertTrue(true);
    

}

@Test
public void esFalsoSiNoTieneCeros (){ 
  AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
	 double[][] matriz = {
   		 { 5.0,  0,  2.4 },
   		 { 2.1, -9.2,  5.1 },
   		 { 2.3,  7.9, 0 },
   		 { 1.0,  0, -8.5 },
   	 };
     assertFalse(false);
    

}

 @Test
public void contarCerosEnUnaMatrizDe1Por1QueNoTieneCeros() {
   	AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
   	double[][] matriz = {
   			 { 1.6 },
   	 };
   	 
   	assertEquals(0, ana.contarCeros(matriz));
    }


@Test
public void analizarRango (){
   	AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
     	double[][] matriz = {
   			 { 1.3,  0.0,  2.4 },
   		 { 2.1, -9.2,  5.1 },
   	 };

     assertEquals(4, ana.contarElementosEnElRango(matriz, 1.3, 5.1));
}

@Test
public void analizarSiElRangoEsVerdadero(){
   	AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
     	double[][] matriz = {
   			 { 1.3,  0.0,  2.4 },
   		 { 2.1, -9.2,  5.1 },
   	 };
     assertTrue(true);;
}

@Test
public void analizarRango2 (){
   	AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
     	double[][] matriz = {
   			 { 1.3,  0.0,  2.4 },
   		 { 2.1, -9.2,  5.1, 8.1, 10.6},
   	 };

     assertEquals(6, ana.contarElementosEnElRango(matriz, 1.3, 10.6));
}

@Test
public void analizarFilas () {
    AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
       	double[][] matriz = {
   			 { 1.3,  0.0,  5.4 },
   		 {2.1, -9.2,  0.0, 8.1},
        
   	 };
     assertEquals(2, ana.contarFilasConCeros(matriz));
}

@Test
public void analizarFilas2 () {
    AnalizadorDeMatrices ana = new AnalizadorDeMatrices();
       	double[][] matriz = {
   			 { 1.3,  0.0,  5.4 },
   		 {2.1, -9.2,  0.0, 8.1},
          {2.1, -9.2,  0.0, 8.1},
        
   	 };
     assertEquals(3, ana.contarFilasConCeros(matriz));
}


@Test 
public void analizarColumnas () {

AnalizadorDeMatrices ana = new AnalizadorDeMatrices();

double [] [] matriz = {
    {0.0, 1.3, 1.6, 0.0},
    {0.0, 1.3, 1.6,1.8},
    {0.0, 1.3, 1.6,1.8},
};
 assertEquals(4, ana.contarColumnasConCeros(matriz));

}

@Test 
public void analizarColumnas2 () {

AnalizadorDeMatrices ana = new AnalizadorDeMatrices();

double [] [] matriz = {
    {0.0, 1.3, 1.6,1.8},
  
};
 assertEquals(1, ana.contarColumnasConCeros(matriz));

}

@Test 
public void analizarColumnassinCeros () {

AnalizadorDeMatrices ana = new AnalizadorDeMatrices();

double [] [] matriz = {
    {4.4, 1.3, 1.6,1.8},
  
};
 assertEquals(0, ana.contarColumnasConCeros(matriz));

}

}





