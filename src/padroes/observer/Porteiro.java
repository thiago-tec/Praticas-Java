package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ChegadaAniversarianteObserve> observadores = new ArrayList<>();
	
	public void registrarObservador(ChegadaAniversarianteObserve observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while (!"sair".equalsIgnoreCase(valor)) {
			
			System.out.println("aniversariante chegou ?");
			valor = entrada.nextLine();
			
			if ("sim".equalsIgnoreCase(valor)) {
				//criar evento
				EventoChegadaAniversariante evento = 
						new EventoChegadaAniversariante(new Date());
				//notificar observadores
				observadores.stream()
				.forEach(o-> o.chegou(evento));
				valor = "sair";
			}else {
				System.out.println("alarme falso");
			}
		}
		
		
		
		
		entrada.close();
	}
	
}
