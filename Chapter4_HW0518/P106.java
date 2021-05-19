package Chapter4_HW0518;

import java.util.Scanner;

public class P106 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int floor = sc.nextInt();
		
		
		switch(floor) {
		case 5:
			System.out.println("5층 헬스클럽입니다");
			break;
		case 4:
			System.out.println("4층 치과입니다");
			break;
		case 3:
			System.out.println("3층 피부과입니다");
			break;
		case 2:
			System.out.println("2층 정형외과입니다");
			break;
		case 1:
			System.out.println("1층 약국입니다");
			break;
		default:
			System.out.println(floor+"층 헬스클럽입니다.");
		
		}

	}

}
