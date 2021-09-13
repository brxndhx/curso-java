package fundamentos;

import java.util.Scanner;

/**
 * @author bvitoria
 *
 */
public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro sal�rio: ");
		String valor1 =  entrada.nextLine().replace(",", ".");
		
		System.out.println("Informe o segundo sal�rio: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Informe o terceiro sal�rio: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		Double salario1 = Double.parseDouble(valor1);
		Double salario2 = Double.parseDouble(valor2);
		Double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("A m�dia dos sal�rios � %f", media);
		
		entrada.close();
	}
}
