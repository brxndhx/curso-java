package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Pedro";
		String sobrenome = "Santos";
		double idade = 33;
		double salario = 12345.987;
		
//		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome);
		System.out.printf("O senhor %s %s tem %f anos e ganha %.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %f anos e ganha %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
				
	}
}
