package chapter03;

import java.util.Scanner;

public class ArrayMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요");
		int[] a = new int[7];
	
		int min = 999999999;
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] =scanner.nextInt();  //값을 반복해서 받아야하기 때문에 for문 안에 들어와야함
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("가장 작은 수는  "+min + "입니다.");
	}

	

}
