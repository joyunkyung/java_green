package chapter04;

import java.util.Scanner;

class CurrencyConver{
	private static double rate;
	public static double toDollar(double won) { //원화->달러
		return won/rate;
	}
	public static double toaKRW(double dollar) { //달러->원화
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate =r;
	}
}
public class StcticMember {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>> ");
		double rate = scanner.nextDouble();
		CurrencyConver.setRate(rate); //클래스 이름으로 메소드 호출 static이라서 바로 호출
		System.out.println("백만원은 "+CurrencyConver.toDollar(1000000) +"달러 입니다");//환율에 맞는 달러를 리턴
		System.out.println("$100는 "+CurrencyConver.toaKRW(100) +"원 입니다");//환율에 맞는 원화를 리턴
	}

}
