package classe;

public class Data {
	
	int mes;
	int dia;
	int ano;
	
	
	Data(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	
	public Data(int dia, int mes, int ano ) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	
	
	String obterDataFormatada() {
		
		final String formato = "hoje é %d de %d de %d";
		return String.format(formato,this.dia, mes, ano);
	}
	
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}

}
