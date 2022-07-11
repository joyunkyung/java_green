package chapter02;

import java.util.Scanner; //Scanner scanner = new Scanner(System.in); 입력시 자동생성

public class ExRectangle {

	public static void main(String[] args) {
		System.out.print("가로,세로 길이를 입력하세요>> ");
		Scanner scanner = new Scanner(System.in);
		
		int a  = scanner.nextInt();
		int b  = scanner.nextInt();
		
		System.out.println("사각형의 면적은 "+ a*b + "입니다.");
	}

}
