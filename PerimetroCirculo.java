package exerciciosJailson;
import java.util.Scanner;

public class PerimetroCirculo {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	
	double Raio;
	
	System.out.println("Insira o raio de um circulo");
	
	Raio = sc.nextDouble();
	double resultado = 2 * Math.PI * Raio;
	
	System .out.println("O raio do ciruculo é: " + resultado);
	sc.close();
	
	
}

}
