package boletin9_2;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos2 {

public void calcular(){
int cont=10,acuSuma=0;
double acuProd=1;
do {
acuSuma=acuSuma+cont;
acuProd=acuProd*cont;
cont++;
} while(cont<=90);
System.out.println("A suma é "+acuSuma+"\nO produto é "+acuProd);
}    

}
