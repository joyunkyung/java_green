package chapter02;

import java.util.Scanner; //Scanner scanner = new Scanner(System.in); �Է½� �ڵ�����

public class ExRectangle {

	public static void main(String[] args) {
		System.out.print("����,���� ���̸� �Է��ϼ���>> ");
		Scanner scanner = new Scanner(System.in);
		
		int a  = scanner.nextInt();
		int b  = scanner.nextInt();
		
		System.out.println("�簢���� ������ "+ a*b + "�Դϴ�.");
	}

}
