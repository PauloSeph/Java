package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "Preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "Verde":
			System.out.println("Sei o Heian Yodan");
		case "Laranja":
			System.out.println("Sei o Heian Sandan");
		case "Vermelha":
			System.out.println("Sei o Heian Nidan");
			default: 
				System.out.println("Não sei nada");
		}
	}
}
