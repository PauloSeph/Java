package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String valor = "";
	
		do {
			System.out.println("Voce precisa falar a palavra correta!");
			System.out.println("Quer sair? ");
			valor = entrada.nextLine();
			
		} while(!valor.equalsIgnoreCase("Please"));
		

		entrada.close();
	}

}
