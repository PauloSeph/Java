package fundamentos;

import javax.swing.JOptionPane;

public class StringToNumber {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o Primeiro N�mero: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o Segundo N�mero: ");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
				
	}
}
