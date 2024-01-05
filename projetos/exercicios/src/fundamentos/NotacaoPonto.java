package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		double a = 2.3;
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!!");
		
		//tipos primitivos não tem o operador "."
		
		
		System.out.println(s);
	}
}
