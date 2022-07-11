package chapter02;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65; //유니코드
		char c3 = '\u0041'; //16진수
		char c4 = '가'; 
		char c5 = 44032; 
		char c6 = '\uac00'; 
		
		System.out.println(c1);
		System.out.println(c2); //Char 이기 때문에 A 출력
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}

}
