package exerciciosJailson;
import java.util.Scanner;

public class Media {
public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
	
System.out.println("Digite o primeiro numero:");
double numero1=sc.nextDouble();

System.out.println("Digite o segundo numero:");
double numero2=sc.nextDouble();

System.out.println("Digite o terceiro numero:");
double numero3=sc.nextDouble();



double resultado = (numero1+numero2+numero3) /3;
//


System.out.println("A media dos valores inseridos é:"+ resultado);
sc.close();

 

}

}
