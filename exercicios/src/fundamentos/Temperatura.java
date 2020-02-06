package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final double CALC = 5.0/ 9;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * CALC;
		System.out.println("O temperatura é : " + celsius);
		
	    fahrenheit = 150;
	    celsius = (fahrenheit - AJUSTE) * CALC;
		System.out.println("O temperatura é : " + celsius);
	}
}
