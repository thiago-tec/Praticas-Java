package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunaA = new double[4];
		notasAlunaA[0] = 7.9;
		notasAlunaA[1] = 8;
		notasAlunaA[2] = 6.7;
		notasAlunaA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunaA));
		System.out.println(notasAlunaA[0]);
		
		
		double totaAlunoA = 0;
		for (int i = 0; i < notasAlunaA.length ; i++) {
			totaAlunoA += notasAlunaA[i];
			}
		
		System.out.println(totaAlunoA / notasAlunaA.length);
		
		
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		double totaAlunoB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			totaAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totaAlunoB / notasAlunoB.length);
	}

}
