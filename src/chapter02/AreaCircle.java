package chapter02;

import java.util.Scanner; //Scanner �ʼ�

public class AreaCircle {

	public static void main(String[] args) {
		System.out.print("�������� �Է��ϼ���.>> ");
		Scanner scanner = new Scanner(System.in);
		
		double radius = scanner.nextDouble();  // �Է��ؾ��ϴ� ���� radius
		final double PI = 3.14; // ��� 
		double circleArearadius =radius * radius * PI;
		
		
		System.out.println("���� ������ " + circleArearadius + "�Դϴ�.");
		scanner.close(); // ��������
	}

}
