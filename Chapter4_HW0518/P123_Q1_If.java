package Chapter4_HW0518;

public class P123_Q1_If {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		if (operator == '+'){
			System.out.println("+ : "+(num1+num2));
		}
		else if (operator == '-') {
			System.out.println("- : "+(num1-num2));
		}
		else if (operator == '*') {
			System.out.println("* : "+(num1*num2));
		}
		else {
			System.out.println("/ : "+(num1/num2));

		}
	}
}



