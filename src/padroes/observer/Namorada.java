package padroes.observer;

public class Namorada implements ChegadaAniversarianteObserve {

	public void chegou(EventoChegadaAniversariante evento) {
	
		System.out.println("avisar convidados");
		System.out.println("apagar luz");
		System.out.println("supresa!!");
		
	}

	
	
}
