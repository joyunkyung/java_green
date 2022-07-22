package chapter04;

import java.util.Scanner;

public class PrintAlphabet {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("알파벳 하나를 입력하세요. >> ");
			String s = scanner.next();
			char c = s.charAt(0); //String타입으로 저장된 문자열을 중 하나만 선택하여 문자로 변환 
			
			for(char i=c; i>='a'; i--) {
				for(char j='a';j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			
			scanner.close();
		}
			
		
}
