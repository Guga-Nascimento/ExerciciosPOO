package exerrcicioswhile;
/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.util.Locale;
import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("INFORME A CORDENADA X: ");
		double x = sc.nextDouble();
		System.out.println("INFORME A CORDENADA Y");
		double y = sc.nextDouble();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Segundo");
				System.out.println();
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
				System.out.println();
			} else if (x < 0 && y > 0) {
				System.out.println("Primeiro");
				System.out.println();
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
				System.out.println();
			}
			System.out.println("INFORME A CORDENADA X: ");
			x = sc.nextDouble();
			System.out.println("INFORME A CORDENADA Y");
			y = sc.nextDouble();
		}
		System.out.println("Fim");

		sc.close();
	}

}
