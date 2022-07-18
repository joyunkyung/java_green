package chapter03;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요");
		int[] a = new int[5];
	
		int max = 0;
		
		for(int i=0 ; i<5 ; i++) {
			a[i] =scanner.nextInt();  //값을 반복해서 받아야하기 때문에 for문 안에 들어와야함
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
