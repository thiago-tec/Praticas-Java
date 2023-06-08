package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
	
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Note", 1897.88),2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("caderno", 10, 10);
		compra2.adicionarItem(new Produto("impressora", 998.90),1);
		
		Cliente cliente = new Cliente("maria");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println("O valor total da compra foi R$ " + cliente.getValorTotal());
		
		
	}

}
