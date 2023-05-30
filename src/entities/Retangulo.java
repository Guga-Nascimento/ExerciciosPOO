package entities;
/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

public class Retangulo {
	
	private double altura;
	private double largura;
	
	public Retangulo() {
		
	}

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double area() {
		return altura*largura;
	}
	public double perimetro() {
		return 2 * (altura + largura);
	}
	public double diagonal() {
		return Math.sqrt(altura * altura + largura* largura);
	}
	
	
}
