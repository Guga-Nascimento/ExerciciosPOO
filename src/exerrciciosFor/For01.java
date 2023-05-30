package exerrciciosFor;
import java.util.Locale;
import java.util.Scanner;
/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
  um valor por linha, inclusive o X, se for o caso.*/
public class For01 {	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		int X;		
		System.out.println("Informe um número: ");
		X = sc.nextInt();		
		for(int i = 0; i <=X ; i++) {
			if(i % 2 ==1) {
				System.out.println(i);
			}			
		}		
		sc.close();
	}
}
