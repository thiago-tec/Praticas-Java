package estruturas;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a nota: ");
		
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota<0) {
			System.out.println("nota invalida");
		} else if(nota >= 7.0) {
			System.out.println("aprovado");
		}
		
		entrada.close();

	}

}
