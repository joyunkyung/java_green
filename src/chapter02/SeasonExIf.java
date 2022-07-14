package chapter02;

import java.util.Scanner;

public class SeasonExIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) >> ");
		
		int x = scanner.nextInt();
		
		if (x>=3 && x<=5) {
			System.out.println("봄");	
			}else if( x>=6 && x<=8) {
				System.out.println("여름");	
			}else if( x>=9 && x<=11) {
				System.out.println("가을");			
			}else if( (x>=1 && x<=2) || (x==12)) {
				System.out.println("겨울");			
			}else {
				System.out.println("잘못입력");
			}
	}

}
