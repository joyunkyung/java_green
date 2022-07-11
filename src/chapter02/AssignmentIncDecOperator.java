package chapter02;

public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		int a=3,b=3,c=3;
		
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a=" + a + ",b=" + b + ",c=" + c);
		
		int d=3;
		a = d++; // d=3이 a로 넘어간 뒤 d++로 d는 4로 증가
		System.out.println("a="+a +",d=" +d);
		
		a = ++d; // 증가 후 a에 대입
		System.out.println("a="+a +",d=" +d);
		
		a = d--; 
		System.out.println("a="+a +",d=" +d);
		
		a = --d; 
		System.out.println("a="+a +",d=" +d);
	}

}
