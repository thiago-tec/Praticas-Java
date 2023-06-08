package padroes.observer;

public class Festa {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		
		Porteiro porteiro = new Porteiro();
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e -> {
			System.out.println("surpresa via lambda");
			System.out.println("ocorreu em: " + e.getMomento());
		});
		
		porteiro.monitorar();

	}

}
