package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
	
//System.out.println(esposa.segredo); <-- isso da erro pois � privado
//System.out.println(mae.facoDentroDeCasa); <-- visibilidade pacote
		System.out.println(formaDeFalar);
		System.out.println(new Ana().todosSabem);
	}

	
}
