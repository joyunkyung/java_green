package chapter03;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class Multiple {

	public static void main(String[] args) {
		int scan =0;
		int number =0;
		boolean multiple = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요: ");
		number = scanner.nextInt();
		
		if(number%3==0) {
			multiple=true;
			System.out.println("3의 배수이다");
			
		}if(number%5==0) {
			multiple=true;
			System.out.println("5의 배수이다");
			
		}if(number%8==0) {
			multiple=true;
			System.out.println("8의 배수이다");
			
		}if(!multiple) {		
			System.out.println("어느 배수도 아니다.");
		}

	}

}
