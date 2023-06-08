package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "par":"impar";
		
		Function<String, String> oResultoE =
				valor -> "o resultado �: " + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
		
				String resultadoFinal = 
						parOuImpar
						.andThen(oResultoE)
						.andThen(empolgado)
						.apply(32);
				
				System.out.println(resultadoFinal);
				
				System.out.println(parOuImpar.apply(33));
				
	}

}
