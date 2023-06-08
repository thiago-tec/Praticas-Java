package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		
		Ana sogra = new Ana();
		
//System.out.println(sogra.segredo); <-- isso da erro
//System.out.println(sogra.facoDentroDeCasa); <-- visibilidade pacote
//system.out.println(sogra.formaDeFalar); <-- visibilidade herança
		System.out.println(sogra.todosSabem);
	}
}
