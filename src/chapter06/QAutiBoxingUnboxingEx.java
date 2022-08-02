package chapter06;

public class QAutiBoxingUnboxingEx {

	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; //자동박싱
//		Integer intObject = Integer.valueOf(n); //박싱
		System.out.println("intObject = " + intObject); // 자동언박싱
//		System.out.println("intObject = " + intObject.intValue(); //언박싱		
		
		int m = intObject + 10; //자동언박싱
//		int m = intObject.intValue(); + 10; //언박싱
		System.out.println("m = " + m);
	}

}
