package estruturas;

public class SwithSemBreak {

	public static void main(String[] args) {
		
		String faixa = "amarela";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("eu sei o bassai");
		case "marrom":
			System.out.println("eu sei teki");
		case "roxa":
			System.out.println("eu sei godan");
		case "verde":
			System.out.println("eu sei yodan");
		case "laranja":
			System.out.println("eu sei sandan");
		case "vermelha":
			System.out.println("eu sei nidan");
		case "amarela":
			System.out.println("eu sei shoodan");
			break;
		default:
			System.out.println("não sei nada");
			
		}

	}

}
