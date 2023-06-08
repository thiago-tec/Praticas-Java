package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.Cliente = "joão";
		c1.adicionarItem("caneta", 20, 7.45);
		c1.adicionarItem(new Item("caderno", 20, 9.99));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
		//so para mostrar a relacao bidirecional
		double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("o total é " + total);
	}

}
