package chapter03;

public class ArrayException {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0]=0; //초기값 설정

		try {
			for (int i = 0; i < intArray.length; i++) {
				intArray[i+1] = i+1+intArray[i];
				System.out.println("intArray[" + i + "] =" + intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}

}//i=4가 되면 intArray[i+1]가 5가 되기 때문에 intArray[3]까지만 출력
