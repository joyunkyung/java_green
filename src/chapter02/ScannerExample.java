package chapter02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.println("�̸�, ����,����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();  // next() ���ڿ�
		System.out.println("�̸��� " + name + ",");
		
		String city = scanner.next();  // next() ���ڿ�
		System.out.println("���ô� " + city + ",");
		
		int age = scanner.nextInt();  
		System.out.println("���̴� " + age+ "��" + ",");
		
		double weight = scanner.nextDouble();  
		System.out.println("ü���� " + weight+ "kg" + ",");
		
		boolean single = scanner.nextBoolean();  
		System.out.println("ü���� " + single + "�Դϴ�." );
		
		scanner.close();    // �ڿ��ݳ�?
		
		
		
	}

}
