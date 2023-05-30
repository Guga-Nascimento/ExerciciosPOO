package entities;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {
	
	private String nome;
	private double nota1,nota2,nota3;
	double notaFinal03,notaFinal02,notaFinal01;
	
	public Aluno() {
		
	}

	public Aluno(String nome, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public void trimestre1() {
	    Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe nota 1");
		nota1 = sc.nextDouble();
		System.out.println("Informe nota 2");
		nota2 = sc.nextDouble();
		System.out.println("Informe nota 3");
		nota3 = sc.nextDouble();
		notaFinal01  = nota1+nota2+nota3+ 30;
	   
	}
	public void trimestre2() {
	    Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe nota 1");
		nota1 = sc.nextDouble();
		System.out.println("Informe nota 2");
		nota2 = sc.nextDouble();
		System.out.println("Informe nota 3");
		nota3 = sc.nextDouble();
		notaFinal02  = nota1+nota2+nota3 + 35;
		
	}
	public void trimestre3() {
	    Locale.setDefault(Locale.US);
	        @SuppressWarnings("resource")
		    Scanner sc = new Scanner(System.in);
			System.out.println("Informe nota 1");
			nota1 = sc.nextDouble();
			System.out.println("Informe nota 2");
			nota2 = sc.nextDouble();
			System.out.println("Informe nota 3");
			nota3 = sc.nextDouble();	
		    notaFinal03  = nota1+nota2+nota3+35;
		   
	}
	public void mediaFinal() {
		 if ((notaFinal01 + notaFinal02 + notaFinal03 - 100) >= 60) {
			 System.out.println(nota1);
			 System.out.println(nota2);
			 System.out.println(nota3);			 
			 System.out.println("Aprovado");
		 }else {
			 System.out.println(nota1);
			 System.out.println(nota2);
			 System.out.println(nota3);
			 System.out.println("Reprovado");			 
		 }
	}

	public double getNotaFinal03() {
		return notaFinal03;
	}

	public void setNotaFinal03(double notaFinal03) {
		this.notaFinal03 = notaFinal03;
	}

	public double getNotaFinal02() {
		return notaFinal02;
	}

	public void setNotaFinal02(double notaFinal02) {
		this.notaFinal02 = notaFinal02;
	}

	public double getNotaFinal01() {
		return notaFinal01;
	}

	public void setNotaFinal01(double notaFinal01) {
		this.notaFinal01 = notaFinal01;
		}
}
