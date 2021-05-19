package Chapter4_HW0518;

import java.util.Scanner;

public class P100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score ;
		

		System.out.print("점수를 입력하세요: ");
		score = sc.nextInt();
		
		if((100>=score) && (score>=90)) {
			System.out.print("A");
		}
		else if((90>=score) && (score>=80)) {
			System.out.print("B");
		} 
		else if((80>=score) && (score>=70)) {
			System.out.print("C");
		}
		else  if((70>=score) && (score>=60)) {
			System.out.print("D");
		} 
		else 
		{
			System.out.print("F");
		
			
		}

	}

}
