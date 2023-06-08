package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data data1 = new Data();
		
		var data2 = new Data(9, 11, 2022);
//		data.dia = 9; 
//		data.mes = 11;
//		data.ano = 2022;
		
		
		String dataFormatada1 = data1.obterDataFormatada();		
		System.out.printf(dataFormatada1);
		
		System.out.println(data2);
		
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
		
	}

}
