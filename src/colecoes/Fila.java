package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
	
		
		Queue<String> fila = new LinkedList<>();
		
		// offer e add = add elementos na fila 
		// diferença é o compatamento quando a fila está cheia 
		
		fila.add("Ana"); 
		fila.offer("Bia"); // lanca uma excecao
		fila.add("Carlos"); // retorna false
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peek e element = vao obter o proximo elemento da fila sem remover
		// difereca é o comportamento ocorre quando a fila esta vazia
		
		System.out.println(fila.peek());  //retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element());// lanca uma excecao
		System.out.println(fila.element());
		
		
		//poll e remove = vao obter o proximo elemento da fila e remove
		// difereca é o comportamento ocorre quando a fila esta vazia
		
		System.out.println(fila.poll()); // returna null
		System.out.println(fila.remove());// lanca uma excecao
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
//		System.out.println(fila.remove());

//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains(...);
		
	}

}
