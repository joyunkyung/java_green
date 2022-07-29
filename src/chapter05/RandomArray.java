package chapter05;

import java.util.Scanner;

public class RandomArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 몇개? ");
		int n = scanner.nextInt();
		int array[] = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			int r = (int)(Math.random()*100+1);
			array[i] = r;
			
			if (i == 0) {
				System.out.print(array[i] + " ");
			}else {
				if (1%10 == 0) {
					System.out.println();
				}
				System.out.print(array[i] + " ");
			}
			}
		}
	}


