package chapter03;

import java.util.Scanner;

public class Tesla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		System.out.println("매수 수량을 입력하시오");
		a = scanner.nextInt();		
		if(a>0) {
			System.out.println ("100달러짜리 " + ((520*a)/100) + "매" + "10달러짜리 " + ((520*a)%100) + "매");
		}
	}

}
