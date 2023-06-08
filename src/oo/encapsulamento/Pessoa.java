package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	private String nome;
	private String sobrenome;
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa(int idade, String nome, String sobrenome) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	// getter
	public int getIdade() {
		return idade;
	}
	//setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
			
		}
	}
	
	public String getNomeCompleto() {
		return getNome() + " " +getSobrenome();
	}
	 
	@Override
	public String toString() {
		
		return "olá sou o " + getNome() + " " + getSobrenome() +  " e tenho " + getIdade();
	}

}
