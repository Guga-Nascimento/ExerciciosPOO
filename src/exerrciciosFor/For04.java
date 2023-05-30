package exerrciciosFor;
/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

import java.util.Locale;
import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Informe quantos testes serão realizados: ");
		int N = sc.nextInt();
		for( int i = 1; i <=N;i++) {
			System.out.println("Informe A");
			double A = sc.nextDouble();
			System.out.println("Informe B");
			double B = sc.nextDouble();
			
			double soma = A / B;
			if (B == 0 ) {
				System.out.println("Divisão impossivel");
			}else { 
				System.out.println("Resutado: "+ soma);
			}
			
			
		}
		sc.close();
	}

}
