package chapter06;

import java.util.Scanner;

public class PersonDriver {


	public static void main(String[] args) {
		String lname;
		String fname;
		Person person1;
		Person person2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("성을 입력하세요: ");
		lname = scanner.next();
		System.out.println("이름을 입력하세요: ");
		fname = scanner.next();
		

		 person1 = new Person();
		 person1.lastName = lname;
		 person1.firstName = fname;
		 
		System.out.println("성: " + person1.getLastName());
		System.out.println("이름: " + person1.getFirstName());
		System.out.println("성명의 길이: " + person1.getLength());
		
		
		System.out.println("성을 입력하세요: ");
		lname = scanner.next();
		System.out.println("이름을 입력하세요: ");
		fname = scanner.next();
		
		person2 = new Person();
		person2.lastName = lname;
		person2.firstName = fname;
		
		System.out.println("성: " + person2.getLastName());
		System.out.println("이름: " + person2.getFirstName());
		System.out.println("성명의 길이: " + person2.getLength());
		
	}

}
