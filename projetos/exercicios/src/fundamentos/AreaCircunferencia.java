package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		//int raio = 3;
		double raio = 3.4;
		final double PI = 3.14159;  // a palavra final serve para que o valor da variavel não seja nunca modificado
		
		double area = PI * raio * raio;
		
		System.out.println("area =" + area + "m2");
	
	}
}
