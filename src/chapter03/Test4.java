package chapter03;

public class Test4 {

	static int[] makeArray() { //return을 해줘야 makeArray()빨간줄 사라짐
		int temp[]= {1,2,3,4,5,6,7,8,9,10}; 
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i+1; 
		}
		return temp;  //return을 해줘야 makeArray()빨간줄 사라짐
	}
	
	public static void main(String[] args) {
	int intArray[];
	intArray = makeArray(); 
	
	for (int i = 0; i < intArray.length; i++) {
		System.out.print(intArray[i]+100 + " ");
	}

}

}
