package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("ana", 7.8, true);
		Aluno a2 = new Aluno("bia", 5.8,false);
		Aluno a3 = new Aluno("daniel", 9.8,true);
		Aluno a4 = new Aluno("gui", 6.8,false);
		Aluno a5 = new Aluno("rebeca", 7.1,true);
		Aluno a6 = new Aluno("pedro", 8.8, false);
		
		List<Aluno> alunos = Arrays.asList(a1, a2,a3,a4,a5,a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> comportamento = a -> a.bomComportamento;
		Function<Aluno, String> saudacao = a -> "parabés " + a.nome + " aprovado(a)";
		
		alunos.stream()
		.filter(aprovado)
		.filter(comportamento)
		.map(saudacao)
		.forEach(System.out::println);

	}

}
