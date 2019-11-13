package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos {
private int num;
Scanner sc = new Scanner(System.in);

public int pedirDatos(){
System.out.println("Introduce un numero");
num=sc.nextInt();
return num;
}

public void calcularNumeros(){
int contador=0,contCeros=0,contPos=0,contNeg=0;
do{
pedirDatos();
if (num==0)
contCeros++;    
else if (num<0)
contNeg++;
else
contPos++;
contador++;
} while(contador!=10) ;
    System.out.println("Numero de ceros: "+contCeros
    +"\nNumeros positivos: "+contPos
    +"\nNumeros negativos: "+contNeg);
}



}
