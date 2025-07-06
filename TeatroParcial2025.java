package PruebaTeatro;
public class Teatro {

private Butacas[][] butacas;

public Teatro(Butacas[][] butacas) {
    this.butacas = butacas;

}


public int hallarButacasSinObstaculos(){
int butacaslibres = 0;
boolean libre = true;
boolean ocupadaButaca = false;
for(int i = 0; i < butacas.length; i ++){
for(int j=0; j < butacas[i].length; j ++){
        if (butacas[i][j].ocupada){
            butacaslibres ++;
            libre = false;
            ocupadaButaca = true;
        }
    }
        if(!ocupadaButaca && libre){
            return i + 1;
        }
    }
    return -1;
}

------------------------------------------------------

package PruebaTeatro;
public class Butacas {
boolean ocupada;

public Butacas(boolean ocupada) {
    this.ocupada = ocupada;
}


}



}
