package chapter02; //중첩 if

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력(0~100): ");
		int score = scanner.nextInt();
		
		System.out.print("학년 입력(1~4): ");
		int year = scanner.nextInt();
		
		if (score >=60) {
			if (year != 4) { //4학년이 아니면 60점 이상일때 합격
				System.out.println("합격");
			}else if (score >=70) { //4학년은  70점 이상이면 합격
				System.out.println("합격");
			}else { //4학년은 70점미만 불합격
				System.out.println("불합격");
			}
		} else { //60점 미만 불합격
			System.out.println("불합격");
		}
	}

}
