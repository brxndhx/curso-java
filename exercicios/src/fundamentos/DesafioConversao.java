package fundamentos;

import java.util.Scanner;

/**
 * @author bvitoria
 *
 */
public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salário: ");
		String valor1 =  entrada.nextLine().replace(",", ".");
		
		System.out.println("Informe o segundo salário: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Informe o terceiro salário: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		Double salario1 = Double.parseDouble(valor1);
		Double salario2 = Double.parseDouble(valor2);
		Double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("A média dos salários é %f", media);
		
		entrada.close();
	}
}
