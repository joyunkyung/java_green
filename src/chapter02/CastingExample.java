package chapter02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;  //int를 char로 변환->44032가 '가'로 출력
		System.out.println(charValue);
		
//		long longValue = 500;
		long longValue = 5000990088L;  //짤려서 출력
		intValue =(int)longValue; //long을 int로 변환
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}

}
