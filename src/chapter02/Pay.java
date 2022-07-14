package chapter02;

import java.util.Scanner;

public class Pay {
	public static void main(String[] args) {
		final int RATE = 5000;
		int pay;
		int hours;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시간을 입력하시오: ");
		hours = scanner.nextInt();
		
		if (hours > 8) {
			pay = (int)(RATE * 8 + (hours - 8)*1.5*RATE);
		}else {
			pay = RATE*hours;
		}
		System.out.println("임금은" + pay +"입니다");
	}
}
