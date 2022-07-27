package chapter04;

import java.util.Scanner;

class Book3{
	String title, author; //속성

	public Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
}

public class BookArray {

	public static void main(String[] args) {
		Book3[] book = new Book3[2]; //2개의 참조변수..? 객체..?
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>> ");
			String title = scanner.nextLine();
			System.out.print("저자>> ");
			String author = scanner.nextLine(); //nextLine();줄바꿈
			book[i] = new Book3(title, author); //객체를 속성(필드)에 저장
		}
		for (int i = 0; i < book.length; i++) {
			System.out.print("(" + book[i].title +"," + book[i].author+")"); //book:객체
		}
	}

}
