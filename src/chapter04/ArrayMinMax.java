package chapter04;

import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 10개를 입력하세요.");
		int a[] = new int[10];
		int max =0;
		int min = Integer.MAX_VALUE; 
		
		for (int i = 0; i <a.length; i++) {
			a[i] =scanner.nextInt(); 
			if(min>a[i]) {
				min = a[i];
			}
			if(max<a[i]) {
				max = a[i];
			}
		}
		System.out.print("가장 작은 수는  "+ min + "이고, ");
		System.out.print("가장 큰 수는  "+ max + "이고, ");
		System.out.println("최소값+최대값은 " + (min+max) + "입니다.");
	}

}
