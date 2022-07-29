package chapter05;

class OuterClass{ //디폴트 클래스
	private String secret = "Time is money";
//	public String secret = "Time is money";
	public OuterClass() {
		InnerClass obj = new InnerClass();
		obj.method();
	}
	public class InnerClass { //InnerClass 내부클래스는 접근지정자 상관없이 접근x, 같은 클래스 안에서는 가능
		public InnerClass() {
			System.out.println("내부 클래스의 생성자 입니다.");
		}
		public void method() {
			System.out.println(secret);
		}
	}
}
public class OuterClassTest {

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		

	}

}
