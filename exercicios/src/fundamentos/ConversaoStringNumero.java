package fundamentos;

import javax.swing.JOptionPane;

public class VonversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero: ");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.printf("Soma � %f", soma);
		System.out.printf("\nM�dia � %f", soma / 2);
		
	}

}
