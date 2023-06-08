package estruturas;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.println("informe nota ou -1 para sair: ");
			nota = entrada.nextDouble();
			
			if (nota <=10 && nota >= 0) {
				total += nota;
				quantidadeNotas++;
			} else if (nota != -1) {
				System.out.println("nota invalida");
			}
		}
		
		double media = total / quantidadeNotas;
		System.out.println("média = " + media);
		
		entrada.close();
		
	}

}
