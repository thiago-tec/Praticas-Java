package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");  
		
		
		for (String canditado : listaAprovados ) {
			System.out.println(canditado);
		}
		
		
		Set<Integer> nums = new HashSet<>();
				
		nums.add(1);
		nums.add(12);
		nums.add(123);
		nums.add(1234);  
		
//		nums.get(1); não é possivel acessar pelo índice
		
		for ( int n : nums) {
			System.out.println(n);
		}
	}

}
