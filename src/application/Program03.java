package application;
/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.*/

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno01 = new Aluno();
		Aluno aluno02 = new Aluno();
		
		aluno01.trimestre1();	
		aluno01.trimestre2();	
		aluno01.trimestre3();		
		aluno01.mediaFinal();
		System.out.println("*****************************");
		aluno02.trimestre3();
		aluno02.trimestre2();
		aluno02.trimestre1();
		aluno02.mediaFinal();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
	

}
