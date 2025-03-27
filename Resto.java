package exerciciosJailson;
import java.util.Scanner;

public class Resto {
public static void main(String[]args) {
	//esse programa traz o resto da divisao
	/*esse comentario 
	 * é multilinha*/
	/**
	 @author aluno */
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Digite um numero:");
	int numero1 =sc.nextInt();
	
	System.out.println("Digite outro numero:");
	int numero2 =sc.nextInt();
	
	int resultado = numero1 % numero2;
	System.out.println("O resto da divisão dos numeros é:" + resultado);
	sc.close();
	
	
}

}
