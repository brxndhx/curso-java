package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salário: %.1f\n", 1234.5678);
		
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		String idade = entrada.nextLine();
		
		System.out.println("\n" + nome + " " + sobrenome + " tem " + idade + " anos");
		
		entrada.close();
	}

}
