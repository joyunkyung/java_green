package chapter03;

public class ContinuTest {

	public static void main(String[] args) {
		String s = "no news is good news";
		int n = 0;
		
		for (int i = 0; i < s.length(); i++) {  //s.length() :문자열 길이 (0부터 시작)
			if(s.charAt(i) != 'n') {
			continue;   // s.length(); -> i++ 로 넘어감
			}
			n++;
			//if(s.charAt(i) == 'n') {  
				// s.charAt(index): index에 해당한는 문자
				//n++;
			
		}
		System.out.println("문장에서 발견된 n의 개수" + n);
	}

}
