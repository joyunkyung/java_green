package chapter02;

public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		int a=3,b=3,c=3;
		
		a += 3;
		b *= 3;
		c %= 2;
		System.out.println("a=" + a + ",b=" + b + ",c=" + c);
		
		int d=3;
		a = d++; // d=3�� a�� �Ѿ �� d++�� d�� 4�� ����
		System.out.println("a="+a +",d=" +d);
		
		a = ++d; // ���� �� a�� ����
		System.out.println("a="+a +",d=" +d);
		
		a = d--; 
		System.out.println("a="+a +",d=" +d);
		
		a = --d; 
		System.out.println("a="+a +",d=" +d);
	}

}