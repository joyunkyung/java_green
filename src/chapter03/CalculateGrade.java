package chapter03;

import java.util.Scanner;

public class CalculateGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("부정행위 여부: ");
		boolean cheating = true;
		cheating = scanner.nextBoolean();
		
		System.out.println("출석률(0~100사이의 정수값): ");
		int attendrate;
		attendrate = scanner.nextInt();
		
		System.out.println("총점(0~100사이의 정수값): ");
		int totalscore = 0;
		totalscore = scanner.nextInt();
		
		String grade;
		
		if (cheating) {
			grade = "F";
		}else if (attendrate < 80) {
			grade = "F";
		}else {
			if(totalscore>=90) {
				grade = "A";
			}else if(totalscore<90 && totalscore>=80) {
				grade = "B";
			}else if(totalscore<80 && totalscore>=70) {
				grade = "C";
			}else if(totalscore<70 && totalscore>=60) {
				grade = "D";
			}else {
				grade = "F";
			}
		}
		System.out.println("학점 = "+ grade);

	}

}
