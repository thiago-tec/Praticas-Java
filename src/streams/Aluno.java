package streams;

public class Aluno {
	
	final String nome;
	final double nota;
	boolean bomComportamento;
	
	public Aluno(String nome, double nota) {
		
		this(nome, nota, true);
		
	}
	public Aluno(String nome, double nota, boolean bomComportamento) {
		
		this.bomComportamento = bomComportamento;
		this.nome = nome;
		this.nota = nota;
	}

	
	public String toString() {
		
		return this.nome;
	}
	
}
