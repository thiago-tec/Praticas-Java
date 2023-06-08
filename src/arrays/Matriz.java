package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtAlunos = entrada.nextInt();
		
		System.out.println("Quantidade de notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtAlunos][qtdeNotas];
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				
				System.out.printf("informe a nota %d do aluno %d :", n + 1,a + 1);
				
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		
		double media = total / (qtAlunos * qtdeNotas);
		System.out.println("m�dia da turma � " + media);
		
		for (double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
		
		
	}

}
