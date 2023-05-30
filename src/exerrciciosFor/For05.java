/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/package exerrciciosFor;

import java.util.Locale;
import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe N");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.printf(" %d,",i);			
			int soma = i * i;
			System.out.printf(" %d,",soma);
			int soma1 = soma * i;
			System.out.printf(" %d,",soma1);
			System.out.println("");			
		}

		sc.close();
	}

}
