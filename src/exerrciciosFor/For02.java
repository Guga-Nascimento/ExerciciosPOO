package exerrciciosFor;
/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

import java.util.Locale;
import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int X, N = 0, M = 0;
		System.out.println("Qual a quantidade de números: ");
		X = sc.nextInt();
		for (int i = 0; i < X; i++) {
			System.out.printf("Informe o número %d: ", (i + 1));
			int Y = sc.nextInt();
			if (Y >= 10 && Y <= 20) {
				M += 1;
			} else {
				N += 1;
			}
		}
		System.out.println(M + " In");
		System.out.println(N + " Out");
		sc.close();

	}

}
