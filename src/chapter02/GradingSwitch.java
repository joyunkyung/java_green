package chapter02; //switch

import java.util.Scanner;

public class GradingSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char grade;
		System.out.print("점수 입력(0~100): " );
		int score = scanner.nextInt();
		
		switch (score/10) { //case에는 연산자 사용x ->score에 사용
			case 10:
//				grade ='A';
//				break;
				//break가 없으면 다음으로 넘어감 , 중복일때 빼면됨
			case 9:
				grade ='A';
				break;
				
			case 8:
				grade ='B';
				break;
				
			case 7:
				grade ='C';
				break;
	
			default:
				grade ='F';
				break;
		}
		System.out.println("학점은 " + grade + "입니다.");
	}

}
