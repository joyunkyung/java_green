package chapter03;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int income=0;
		Scanner scanner = new Scanner(System.in);
		
		for (int fare = 0; fare <= 10000; fare++) {
				income+=fare;
				System.out.println("요금을 입력하세요: ");
				fare = scanner.nextInt();
		}
		System.out.println("총 수입: "+income);
	}

}
