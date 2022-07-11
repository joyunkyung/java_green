package chapter02;

import java.util.Scanner;

public class ExCalculation {

	public static void main(String[] args) {
		System.out.print("2°³ÀÇ ½Ç¼ö ÀÔ·Â>> ");
		Scanner scanner = new Scanner(System.in);
		
		double a  = scanner.nextDouble();
		double b  = scanner.nextDouble();
		
		System.out.println("µÎ¼öÀÇ µ¡¼ÀÀº "+ (a+b));
		System.out.println("µÎ¼öÀÇ »¬¼ÀÀº "+ (a-b));
		System.out.println("µÎ¼öÀÇ °ö¼ÀÀº "+ (a*b));
		System.out.println("µÎ¼öÀÇ ³ª´°¼ÀÀº "+ (a/b));
	}

}
