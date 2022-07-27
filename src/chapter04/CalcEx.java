package chapter04;

class Calc{//디폴트 클래스 public은 1개만 생성 가능
	public static int abs(int a) {
		
		return a>0?a:-a;  //절대값
	}
}

public class CalcEx {

	public static void main(String[] args) {
		Calc.abs(-5); //class 이름으로 static 메서드 호출
		System.out.println(Calc.abs(-5));
		
	}

}
