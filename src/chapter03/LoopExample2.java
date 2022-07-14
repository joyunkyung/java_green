package chapter03;

import java.util.Scanner;

public class LoopExample2 {

	public static void main(String[] args) {
		int n;
		int i = 1;
		System.out.println("구구단 ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		while (i<=9) {
			System.out.println(n+"*"+i+"="+ n*i);
			i++;
		}
	}

}
