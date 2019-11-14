package boletin9_4;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos4 {
private int num;
Scanner sc = new Scanner(System.in);

public void pedirInt(){
  System.out.println("Introduce un numero para obter a sua taboa e 0 para saír do programa");
  num=sc.nextInt();
}
public void calcularTaboa(){
do{
pedirInt();
if (num!=0){
System.out.println("A taboa é: \n"+num+"x1="+num*1+"\n"+num+"x2="+num*2+"\n"+num+"x3="
+num*3+"\n"+num+"x4="+num*4+"\n"+num+"x5="+num*5+"\n"+num+"x6="+num*6+"\n"
+num+"x7="+num*7+"\n"+num+"x8="+num*8+"\n"+num+"x9="+num*9+"\n"+num+"x10="+num*10);
}    
}while (num!=0);
    System.out.println("Fin do programa");
}




}
