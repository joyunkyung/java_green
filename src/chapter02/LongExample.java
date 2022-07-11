package chapter02;

public class LongExample { //Long 타입

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L; //대소문자 상관x
//		long var3 = 3000000000;  //기본값이 int라서 long이라도 오류(20억이상)
		long var3 = 300000000;
		long var4 = 3000000000L; //L/l 붙이면 오류x
		
			
			System.out.println(var1);
			System.out.println(var2);
			System.out.println(var3);
			System.out.println(var4);
	}

}
