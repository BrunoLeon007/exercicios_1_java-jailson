package exerciciosJailson;
import java.util.Scanner;

public class AreaRetangulo {
public static void main(String[]args) {
	
Scanner sc = new Scanner(System.in);

System.out.println("Insira a largura do retangulo");
float largura = sc.nextFloat();

System.out.println("Insira a altura do retangulo");
float altura = sc.nextFloat();

float resultado = altura * largura;

System.out.println("A area do retangulo é: " + resultado);
sc.close();

	
}

}
