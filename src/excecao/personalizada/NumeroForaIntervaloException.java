package excecao.personalizada;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException{

	
	String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	

	public String getMessage() {	
		return String.format("o atributo '%s' está fora do intervalo",
				nomeDoAtributo);
	}
	
}
