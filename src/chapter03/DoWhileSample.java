package chapter03;

public class DoWhileSample {

	public static void main(String[] args) {
		char c ='a';
		
		 do {
			 System.out.print(c);
			 c = (char)(c+1);   //a+1=b 유니코드
		 } while(c <= 'z');
	}

}
