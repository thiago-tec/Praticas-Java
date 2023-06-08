package estruturas;

import java.util.Scanner;

public class SwithComBreak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.print("informe a nota de 10 à 3:" );
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3: 
			conceito = "E";
			break;

		default:
			conceito = "n informado";
			break;
		}

		System.out.println("a nota informada foi:" + nota);
		System.out.println("o conceito nesse caso é " + conceito);
		
		
		entrada.close();
	}

}
