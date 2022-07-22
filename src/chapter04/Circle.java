package chapter04;

public class Circle {
	int radius; //radius,name :속성
	String name;
	
	public Circle() {} //클래스와 같은 이름의 메소드=생성자 (메소드와 별개로 봄)

	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza; //pizza:참조변수
		pizza = new Circle(); //객체 생성 ,pizza:객체
		pizza.radius=10;
		pizza.name="자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle(); //한 줄로 나타낼 수 있음
//		donut = new Circle();
		donut.radius=2;
		donut.name="자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}

}
