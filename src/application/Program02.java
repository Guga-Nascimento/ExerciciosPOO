package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Informe o nome do funcionário");
		funcionario.setNome(sc.nextLine());
		System.out.println("Informe Salário Bruto do Funcionário");
		funcionario.setSalarioBruto(sc.nextDouble());
		System.out.println("Informe o descinto de Imposto ");
		funcionario.setImposto(sc.nextDouble());
		
		System.out.println("NOME: " + funcionario.getNome());
		System.out.println("SALÁRIO: " + funcionario.getSalarioBruto());
		System.out.println("IRRF: " + funcionario.getImposto());
		System.out.println();
		System.out.println("SALÁRIO LIQUIDO: " + funcionario.salarioLiquido());
		System.out.println();
		System.out.println("Informe a porcentagem de aumento de salário: " );
		funcionario.aumentoSalario(sc.nextDouble());
		System.out.println("Salário liquido após o aumento: " + funcionario.salarioLiquido());
		
		
		
	
		sc.close();
	}

}
