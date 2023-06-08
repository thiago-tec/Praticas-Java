package excecao.personalizadaComExcecao;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception{

	
	String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	

	public String getMessage() {	
		return String.format("o atributo '%s' está fora do intervalo",
				nomeDoAtributo);
	}
	
}
