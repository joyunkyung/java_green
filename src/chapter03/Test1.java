package chapter03;

public class Test1 {

	public static void main(String[] args) {
       
        for (int num = 1; num <= 99; num++) {
        	if((num/10==3 || num/10== 6 || num/10==9) &&
        			(num%10==3 || num%10== 6 || num%10==9)) {
        		 System.out.println(num + "박수짝짝");
        	}else if (num/10==3 || num/10== 6 || num/10== 9) {
        		System.out.println(num + "박수짝");
        	}else if (num%10==3 || num%10== 6 || num%10==9)
        		System.out.println(num+ "박수짝");
		}
    }
}
