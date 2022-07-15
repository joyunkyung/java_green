package chapter03;

import java.util.Scanner;

public class EcStock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cos = 0;
		int dal = 0;
		System.out.print("코스피 지수를 입력하세요(1800~2500): ");
		cos = scanner.nextInt();
		System.out.print("환율을 입력하세요(1100~1200): ");
		dal = scanner.nextInt();
		
			if(cos>=2199 && cos<=2000 && dal>=1150) {
				System.out.println("횡보장");
			}else if(cos>=2200 && dal>=1150) {
				System.out.println("상승장");
			}else if(cos<2000) {
				System.out.println("하락장");
			}else if(cos>=2300) {
				System.out.println("상승장");
			}else if(cos>=2000 && cos<=2299 ) {
				System.out.println("횡보장");
			}
	}
			
	}


