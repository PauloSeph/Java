package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print("Dia");
		System.out.println("Bom");
		
		System.out.printf("Megasena: %d %d %d", 1, 2, 3);
		
		
//		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita algo: " );
		String nome = entrada.nextLine();
		System.out.println("Digita seu Sobrenome: " );
		String sobrenome = entrada.nextLine();
		
	    System.out.println("Digite sua Idade");
	    int idade = entrada.nextInt();
	    
		System.out.printf("%s %s tem %d anos.",
				nome, sobrenome, idade); 
		entrada.close();
	}

	
}
