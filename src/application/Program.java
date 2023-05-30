package application;
/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;//CLASSE USADA NO EXERCICIO:

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo  retangulo = new Retangulo();
		System.out.println("Informe a altura e a largura :");
		retangulo.setAltura(sc.nextDouble());
		retangulo.setLargura(sc.nextDouble());
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		sc.close();
	}

}
