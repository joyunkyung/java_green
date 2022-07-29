package chapter05;

import java.util.Scanner;

public class SqlTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한글 단어 검색 프로그램입니다.");
		String kor = "";
		String eng = "";
		while(true) {
			
			if (kor.equals("사랑")) {
				eng = "hope"; 
				System.out.println(kor +"은 " + eng);
			}
			if (kor.equals("아기")) {
				eng = "baby"; 
				System.out.println(kor +"는 " + eng);
			}
			if (kor.equals("돈")) {
				eng = "money"; 
				System.out.println(kor +"은 " + eng);
			}
			if (kor.equals("미래")) {
				eng = "future"; 
				System.out.println(kor +"는 " + eng);
			}
			if (kor.equals("희망")) {
				eng = "hope"; 
				System.out.println(kor +"은 " + eng);
			}else {
				System.out.println(kor + "는 사전에 없는 단어입니다.");
			}
			System.out.print("한글 단어? ");
			kor = scanner.next();
		}
		
	}

}
