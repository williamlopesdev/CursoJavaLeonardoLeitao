package fundamentos;

public class Temperatura {

	
	public static void main(String[] args) {
		//(�F -32) * 5/9.0 = �C
		
		final double ajuste = 32.0;
		final double multi = 5.0/9.0;
		double F = 86;
		
		double C = (F - ajuste) * multi;
		
		System.out.println(C);
	
	}
}
