package chapter02; //if else

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int number = scanner.nextInt();
		
		if(number % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수 아님");
		}
	}

}
