package chapter02;

import java.util.Scanner;

public class SeasonExIfSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) >> ");
		
		int x = scanner.nextInt();
		String season = "";
		
		switch (x) {
			case 3:
			case 4:
			case 5:
			season= "봄";
			break;
			
			case 6:
			case 7:
			case 8:
			season= "여름";
			break;
			
			case 9:
			case 10:
			case 11:
			season= "가을";
			break;
			
			case 1:
			case 2:
			case 13:
			season= "겨울";
			break;
			
		default:
			break;
		}
		System.out.println(season);

	}

}
