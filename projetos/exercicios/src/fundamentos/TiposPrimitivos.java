package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		
		//Informações do funcionario
		
		//tipos numericos inteiros
		
		byte anosDeEmpres = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosacumulados = 3134845223L;
		
		
		//Tipos numericos reais, com ponto flutuante
		
		float salario = 11445.44F;
		double vendasAcumuladas = 2991797103.01;
		
		boolean estaDeFerias = false;
		char status = 'a';
		
		// Dias de empresa
		System.out.println(anosDeEmpres * 365);
		
		// Numero de Viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por Real
		System.out.println(pontosacumulados / vendasAcumuladas );
		
		//salario
		System.out.println(salario + id);
		
		// Ferias?
		System.out.println(estaDeFerias);
		
		//status
		System.out.println(status);
		
	}
}
