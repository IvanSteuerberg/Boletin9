package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos3 {
private int base;
private int altura;
Scanner sc = new Scanner(System.in);

public void pedirBase(){
    System.out.println("Introduce o valor da base");
    base=sc.nextInt();
}
public void pedirAltura(){
    System.out.println("Introduce o valor da altura");
    altura=sc.nextInt();

}
public void calcularArea(){
do{
pedirBase();
}while (base<=0);
do{
pedirAltura();
}while (altura<=0);
    System.out.println("O valor do área é: "+base*altura);
}

}
