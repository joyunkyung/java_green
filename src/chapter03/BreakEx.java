package chapter03;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit를 입력하면 종료합니다. ");
		String a = "exit";
		String b = "";
		
		while(true) {
			b = scanner.next();
	
			if(b.equals(a)) {
				System.out.println("종료합니다.");
				break;
		}

	}

	}
}
