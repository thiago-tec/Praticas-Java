package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		
		
		Function<Produto, Double> precoComDesconto = produto ->  produto.preco * (1 - produto.desconto);
				
		UnaryOperator<Double> imposto = preco -> preco>= 2500 ? preco * 1.085 : preco;
				
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 5;
		
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formatado = preco -> ("R$"+ preco).replace(".", ",");
		
		Produto p = new Produto("ipad", 3235.89, 0.13);
		
		String preco = precoComDesconto.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatado).apply(p);
		
		System.out.println(preco);

	}

}
