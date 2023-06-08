package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quantidades de notas: ");
		
		int qtdenotas = entrada.nextInt();
		
		double[] notas = new double[qtdenotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		double total= 0;
		for (double nota : notas) {
			total += nota;
		}
		
		
		double media = total / notas.length;
		System.out.println(" a média é " + media + "!");
		
		
		entrada.close();
		
	}

}
