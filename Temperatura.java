package exerciciosJailson;
import java.util.Scanner;

public class Temperatura {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	
	float Celsius;
	
	System.out.println("Insira a temperetura atual em °C (Grau Celsius)");
	
	Celsius = sc.nextFloat();
	float resultado =  ((Celsius*9)/5) + 32 ;
	
	System .out.println("Realizada a conversão de temperatura para Fahrenheit " + resultado);
	sc.close();
	
	
}

}
