package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "pedro";
		u1.email = "pedro@teste.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "pedro";
		u2.email = "pedro@teste.com.br";
		
		System.out.println( u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//AreaCircTeste c1 = new AreaCircTeste();
		
		AreaCircTeste c2 = new AreaCircTeste();
		
		System.out.println(c2);
		
		//System.out.println(u2.equals(new Date()));
	}

}
