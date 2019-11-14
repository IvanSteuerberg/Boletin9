
package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos5 {
private int num;
Scanner sc = new Scanner(System.in);

public void pedirInt(){
System.out.println("Introduce o numero de elementos das sucesiones");
num=sc.nextInt();
}
public void sucesions(){
pedirInt();
int cont;
int acu1=0;
for(cont=0;cont<num;cont++){
acu1=acu1+2;
System.out.println(acu1);
}
System.out.println("Fin serie a");
int acu2=0;
for (cont=0;cont<num;cont++){
if(acu2>0)
acu2=(acu2+1)*(-1);
else{
acu2=(acu2-1)*(-1);}    
System.out.println(acu2);
}
System.out.println("Fin serie b");
System.out.println(0);
int acuA,acuB=1,acuC=0;
for (cont=0;cont<num;cont++){
acuA=acuB;
acuB=acuC;
acuC=acuA+acuB;
System.out.println(acuC);
}
System.out.println("Fin serie c");
}

}
