package chapter02;

public class TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i);
		System.out.println(10/4); //정수끼리 계산은 값도 정수
		System.out.println(10.0/4); //10.0을 실수로 취급해서 값도 실수
		System.out.println(2.9 + 1.8);
		System.out.println((int)2.9 + 1.8); // (int)2.9=2
		System.out.println((int)(2.9 + 1.8)); // (int)2.9=2
	}

}
