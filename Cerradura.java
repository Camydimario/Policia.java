// clase


public class Cerradura {
    //atributos
    private int claveDeApertura; 
    private int cantidadDeFallosConsecutivosQueLaBloquean;
    private boolean abierta;
    private boolean bloqueada;
    private int aperturasExitosas;
    private int aperturasFallidas;
    private int fallosConsecutivos;

    // constructor

public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
this.claveDeApertura = claveDeApertura; 
this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
this.abierta =  false;
this.bloqueada = false;
this.aperturasExitosas = 0;
this.aperturasFallidas= 0;
this.fallosConsecutivos = 0;
}


public boolean abrir(int clave){
    if( clave == claveDeApertura ){
        this.abierta =  true;
        this.aperturasExitosas ++;
        this.fallosConsecutivos = 0;
    }
 return true;
}

public void cerrar() {
    if (this.bloqueada){
        this.abierta =  false;
}
}

public boolean estaAbierta(){
    return this.abierta;

}

public boolean estaCerrada(){
    return !this.abierta;

}

public boolean fueBloqueada(){
    return this.bloqueada;
}

public int contarAperturasExitosas(){
    return this.aperturasExitosas;
   }

public int contarAperturasFallidas(){
    return this.aperturasFallidas;

}



public static void main(String[] args) {
    Cerradura cerradurita = new Cerradura(3541, 3);

    //Verificamos si esta abierta
    System.out.println("Abrir Cerradura:  " + cerradurita.abrir(3541));

    //cerramos cerradura
   cerradurita.cerrar();

   //Verificamos si esta abierta 
   System.out.println("Esta abierta? " + cerradurita.estaAbierta());

 //Verificamos si esta cerrada
   System.out.println("Esta cerrada? " + cerradurita.estaCerrada());

 //Verificamos si fue bloqueada
   System.out.println("Fue bloqueada? " + cerradurita.fueBloqueada());

 //Verificamos aperturas exitosas
   System.out.println("La cantidad de aperturas exitosas es de: " + cerradurita.contarAperturasExitosas());
   
 //Verificamos aperturas fallidas
   System.out.println("La cantidad de aperturas fallidas es de: " + cerradurita.contarAperturasFallidas());





}


}

