package chapter02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;  //int�� char�� ��ȯ->44032�� '��'�� ���
		System.out.println(charValue);
		
//		long longValue = 500;
		long longValue = 5000990088L;  //©���� ���
		intValue =(int)longValue; //long�� int�� ��ȯ
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}

}
