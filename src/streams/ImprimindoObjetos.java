package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca","Ana");
		
		System.out.println("usando foreach");
		for(String nome:aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nusando o Iterator");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nagora com Stream");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);

	}

}
