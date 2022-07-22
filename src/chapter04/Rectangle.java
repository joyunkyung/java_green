package chapter04;

import java.util.Scanner;

public class Rectangle {
	int width; //width,height:속성
	int height;
	
	public int getArea() {
		return width*height;  //사각형 넓이
	}
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); //rect:참조변수
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		
		rect.width = scanner.nextInt(); //rect: 객체
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 넓이는 "+rect.getArea());
	}

}
