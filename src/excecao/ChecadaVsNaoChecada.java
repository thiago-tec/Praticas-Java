package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args){
		
		
		try {
			gerarErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			gerarErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim");

	}
	//exececao NÃO checada ou Não verificada 
	static void gerarErro1() {
		throw new RuntimeException("ocorreu um erro bem legal 1");
	} 
	
	
	//exececao  checada ou verificada 
	static void gerarErro2() throws Exception{
		throw new Exception("ocorreu um erro bem legal 2");
	} 

}
