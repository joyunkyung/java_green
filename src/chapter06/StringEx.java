package chapter06;

public class StringEx {

	public static void main(String[] args) {
		String a =new String(" C#");
		String b =new String(",C++ ");
		System.out.println(a + "의 길이는 " + a.length());
		System.out.println(a.contains("#")); //#이 있는지 있으면 true
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a); //공백제거
		
		a = a.replace("C#", "Java");
		System.out.println(a); 
		
		String s[] = a.split(",");  //, 기준으로 분리
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열 " + i + ":" + s[i]);	
		}
		a = a.substring(5); //5번째부터 시작
		System.out.println(a);
		
		char c = a.charAt(2); // 특정위치 문자 반환
		System.out.println(c);
				
	
	}

}
