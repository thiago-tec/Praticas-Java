package excecao;

public class Aluno {
	
	public final String nome;
	public final double nota;
	public boolean bomComportamento;
	
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
