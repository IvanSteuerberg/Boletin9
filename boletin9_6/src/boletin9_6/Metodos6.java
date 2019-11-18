package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos6 {
private int soldo;
Scanner sc = new Scanner(System.in);

public void pedirInt(){
System.out.println("Introduce o soldo do empleado");
soldo=sc.nextInt();
}
public void calcular(){
int cont=0,numTrab=0;
float numTrab2=0;
do{ 
pedirInt();
if(soldo>=1000 && soldo<=1750)
numTrab++;    
else if (soldo<1000 && soldo>0)
numTrab2++;
if (soldo!=0)
cont++;
}while(soldo!=0);
if (cont!=0){
System.out.println("O numero de traballadores cun soldo entre 1000 e 1750 euros é: "+numTrab
+"\nA porcentaxe de traballadores cun soldo inferior a 1000 euros é: "+(numTrab2/cont)*100);
}
System.out.println("Fin do programa");
}        
        
}
