package chapter03;

import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        int num;
	        System.out.print("10~99 중의 정수 하나를 입력>> ");
	        num = scanner.nextInt();
	        
	        if(num>=10) {
	        	if((num/10==3 || num/10== 6 || num/10==9) &&
	        			(num%10==3 || num%10== 6 || num%10==9)) {
	        		 System.out.println("박수짝짝");
	        	}else if (num/10==3 || num/10== 6 || num/10== 9) {
	        		System.out.println("박수짝");
	        	}else if (num%10==3 || num%10== 6 || num%10==9)
	        		System.out.println("박수짝");
	        }
	        }
	        
	              
	        
	}
