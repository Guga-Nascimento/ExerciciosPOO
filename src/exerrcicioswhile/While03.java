package exerrcicioswhile;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/
import java.util.Locale;
import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua peferência:\n"
				+ "01  Alcool\n"
				+ "02  Gasolina\n"
				+ "03 Diesel\n"
				+ "04 Sair\n");
		int n = sc.nextInt();
		int alcool = 0,gasolina = 0, diesel = 0;
		
		
		while(n != 4) {
			System.out.println("Informe sua peferência:\n"
					+ "01  Alcool\n"
					+ "02  Gasolina\n"
					+ "03 Diesel\n"
					+ "04 Sair\n");
			n = sc.nextInt();
			
			if(n == 1) {
				alcool += 1;
			}else if(n == 2 ) {
				gasolina += 1;
			}else if (n == 3) {
				diesel += 1;
			}else if(n == 4 ) {
				System.out.println(String.format("MUITO OBRIGADO\n"
						+ "Alcool = %d\n"
						+ "Gasolina = %d\n"
						+ "Diesel = %d\n",alcool,gasolina,diesel));	 
			}else {
				System.out.println("Informe Um Produto Válido! ");
	
		
		}
	}
		sc.close();
	}
}


