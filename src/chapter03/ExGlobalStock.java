package chapter03;

import java.util.Scanner;

public class ExGlobalStock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double a = 0.0;
		Double b = 0.0;
		System.out.print("매수금액을 입력하세요: ");
		a = scanner.nextDouble();
		System.out.print("매도금액을 입력하세요: ");
		b = scanner.nextDouble();
		Double c = 0.0;
		
		if(a<b) {
			c = (b-a)*0.22;
		} else {
			c = 0.0 ;
			
		}
		System.out.println("양도세 = " + c);
	} 

}
