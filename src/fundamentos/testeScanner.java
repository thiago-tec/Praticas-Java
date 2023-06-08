package fundamentos;

public class testeScanner {
	public static void main(String[] args) {
		
		
		
//			teste de string
		
//		Scanner testando = new Scanner(System.in);
//			System.out.print("digite seu nome: ");
//			String name = testando.nextLine();
//
//			System.out.print("digite a sua idade: ");
//			int idade = testando.nextInt();
//
//			System.out.print("sua idade é " + idade);
//			System.out.print(" e seu nome é " + name);
//		

		// wrappers é uma classe q acaba envolvendo tipos primitivos

		Byte b = 100;
		Short s = 1000;
		// Integer i = 10000 Integer.parseInt(testando.next());

		Integer i = 10000; // int
		Long l = 1000000L; // long só converte de long para long +
		// ou seja sempre tem q colocar o L no final e tem q ser maiusculo

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;//se não informar com um F q é tipo float vc n irá conseguir 
						//converter um tipo int para o float um double para um float
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //para transformar o wrapper +
		//boolean para capslock(toUpperCase) 
		
		
		Character c = '#'; //char
		System.out.println(c + "...");

	}
}
