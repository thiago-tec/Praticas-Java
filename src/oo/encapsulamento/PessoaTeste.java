package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(-45, "Thiago", "Cordeiro");
		p1.setIdade(230); // alterar valor
		
		System.out.println(p1.getIdade()); //ler valor
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());

	}

}
