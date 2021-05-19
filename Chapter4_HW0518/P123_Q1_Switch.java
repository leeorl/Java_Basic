package Chapter4_HW0518;

public class P123_Q1_Switch {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		switch (operator) {
		case '+': 
			System.out.println("+ : "+(num1+num2));
			break;
		case '-' :
			System.out.println("- : "+(num1-num2));
			break;
		case '*':
			System.out.println("* : "+(num1*num2));
			break;
		default : System.out.println("/ : "+(num1/num2));
		}


	}

}
