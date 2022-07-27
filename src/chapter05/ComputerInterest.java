package chapter05;

import java.util.Scanner;

public class ComputerInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원금을 입력하세요: ");
		int principle = scanner.nextInt();
		System.out.print("연이율을 입력하세요: ");
		double rate = scanner.nextDouble();
		double balance = 0;
		int years=0;
		
		balance = principle;
		System.out.println("\n연도수\t원리금");
		
		
		do {
			years++;
			balance= balance *(1.0 +rate/100.0);
			System.out.println(years +"\t"+ balance);
		} while (balance <= 2.0 * principle);
		
		System.out.println("\n 필요한 연도수 = " + years);
		

	}

}
