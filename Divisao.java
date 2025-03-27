package exerciciosJailson;

import java.util.Scanner;

public class Divisao {
public static void main(String[]args) {
Scanner sc= new Scanner(System.in);
System.out.println("Digite um numero:");
float numero1=sc.nextFloat();
System.out.println("Digite outro numero:");
float numero2=sc.nextFloat();
float resultado = numero1/numero2;
System.out.printf("A divisão dos valores é:%.2f",resultado);
sc.close();
}
}

