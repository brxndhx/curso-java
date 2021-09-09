package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		
//		System.out.println(2 + 3);
		
		double raio = 3.4;
		final double pi = 3.14159;
		
		double area = raio * raio * pi;
		
		System.out.println(area);
		
		raio = 10;
		area = raio * raio * pi;
		System.out.println("Área: " + area);
	}

}
