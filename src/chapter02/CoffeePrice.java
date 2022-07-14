package chapter02;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("무슨 커피를 드릴까요? ");
		String order = scanner.next(); //next() 문자열 메소드
		int price = 0; //초기값을 줘야함
		
		switch (order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price=3500;
				break;
			
			case "아메리카노":
				price=2000;
				break;

			default:
				System.out.println("메뉴x");
				break;
		}
		if (price !=0) {  //price가 0이 아닌 경우만 order +"는"+ price + "원입니다" 출력,
			 				//없는 메뉴는 디폴트값 메뉴x 출력
			System.out.println(order +"는"+ price + "원입니다");			
		}
	}

}
