package fundamentos;

import javax.swing.JOptionPane;

public class conversaoStringNumero {
	public static void main(String[] args) {

		String valor1 = JOptionPane.showInputDialog("digite o primeiro n�mero:");
		String valor2 = JOptionPane.showInputDialog("digite o segundo n�mero:");//para mostrar a caixa de texto

		System.out.println(valor1 + valor2);

		double numero1 = Double.parseDouble(valor1);//parse � para converter o valor para string para valor inteiro e etc
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("soma � " + soma);
		System.out.println("m�dia � " + soma /2);
		
	}

}
