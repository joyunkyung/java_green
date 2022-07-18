package chapter03;

import java.util.Scanner;

public class EmergencyMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int hundred = 120000;
		final int ten = 12000;
		int res, money, num;
		
		System.out.print("가구수를 입력하시오>> ");
		num = scanner.nextInt();
		
		if(num == 1) {
			money = 400000;
		}else if (num == 2) {
			money = 600000;
		}else if (num == 3) {
			money = 800000;
		}else {
			money = 1000000;
			
		res = money/hundred;
		money = money%hundred;
		if (res > 0 ) {
			System.out.println("100달러짜리" + res + "매");
		}
			
		res = money/ten;
		if (res > 0 ) {
			System.out.println("10달러짜리" + res + "매");
		}
}


	}
}



//int dal = 1200;
//int home = 0;
//System.out.print("가구수를 입력하시오>> ");
//home = scanner.nextInt();
//int res = 0;
//int a = 0;
//int money =0;
//res = money /dal;
//a = res/100;
//money =money%100;
//if(res>1) {
//	System.out.println("100달러짜리 " + res + "매");
//	if(home ==1) {
//		money = 4000000;	
//	}else if(home ==2)
//		money = 6000000;	
//	}else if(home ==3)
//		money = 6000000;	
//}
//res = money/10;
//if(res>1) {
//	System.out.println("10달러짜리 " + res + "매");
//}

	