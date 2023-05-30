package exerrciciosFor;
/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

import java.util.Locale; 
import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Informe quantos testes serão realizados: ");
		int N = sc.nextInt();
		for( int i = 1; i <=N;i++) {
			double n1,n2,n3,soma=0;
			System.out.println("Informe o primeiro número: ");
			n1 = sc.nextDouble();
			System.out.println("Informe o segundo número: ");
			n2 = sc.nextDouble();
			System.out.println("Informe o terceiro número: ");
			n3 = sc.nextDouble();			
			soma += (n3*5 + n2*3 + n1*2)/10;
			System.out.printf("Resultado : %.1f", soma);
			System.out.println();
			soma = 0;
			
		}
		
		
		
		
		
		sc.close();
	}

}
