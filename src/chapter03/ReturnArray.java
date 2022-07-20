package chapter03;

public class ReturnArray {
		static int[] makeArray() {
			int temp[]=new int[4]; //4개짜리 temp라는 배열을 생성
			
			for (int i = 0; i < temp.length; i++) {
				temp[i]=i; //0~3
			}
			return temp;  // temp 배열 리턴 -> 0~3까지 담김
		}
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray(); 
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

}
