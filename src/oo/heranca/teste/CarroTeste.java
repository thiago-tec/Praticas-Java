package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		System.out.println("agora é o civic");
		
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari(400);
		System.out.println("agora é a ferrari");
		
		c2.ligarTurbo();
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar(); 
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		System.out.println(c2.velocidadeDoAr());
		
		
		
	}

}
