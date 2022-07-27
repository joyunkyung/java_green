package chapter05;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int[] don = new int[] {50000, 10000, 1000, 500, 100, 50, 10};
        
        while(true) {
            System.out.println("금액을 입력하시오 : ");
            int money = scanner.nextInt();
            for(int i = 0; i<don.length; i++) {
                System.out.println(don[i] + "원 : " + (money/don[i]));
                money %= don[i]; // money를 don[i]로 나누고 그 나머지를 money에 대입한다. 
            }
        }
	}
}

        