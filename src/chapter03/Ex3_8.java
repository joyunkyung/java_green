package chapter03;

public class Ex3_8 {

	public static void main(String[] args) {
		String str = "Programming is fun! Right?";
		char[] charArr = str.toCharArray(); //각각의 문자값을 배열 원소로 나열
		int count = 0;
		
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == 'R' || charArr[i] == 'r') {
				count++;
			}
		}
		
		System.out.println(str);
		System.out.println("=> R(r)의 갯수: " + count);
		
	}

}
