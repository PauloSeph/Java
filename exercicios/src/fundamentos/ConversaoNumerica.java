package fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2));
		
		System.out.println(("" + num1).length());

	}

}