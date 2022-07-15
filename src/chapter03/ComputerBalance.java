package chapter03;

import java.util.Scanner;

public class ComputerBalance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요: ");
		int purch = scanner.nextInt();
		int balance =0;
		
		if(purch>=300000) {
			System.out.println("구매금액 = " + purch);
			System.out.println("청구금액 = " + (purch-30000) );			
		}else if(purch>=100000 && purch<300000) {
			System.out.println("구매금액 = " + purch);
			System.out.println("청구금액 = " + (purch-5000) );	
		}else if(purch<100000) {
			System.out.println("구매금액 = " + purch);
			System.out.println("청구금액 = " + purch);	
	}
	}
}
