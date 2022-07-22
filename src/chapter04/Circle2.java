package chapter04;

public class Circle2 {
	int radius;
	String name;
	
	public Circle2(){ //기본 생성자
		radius=1; 
		name="";
	}

	public Circle2(int r, String n){  //int r, String n:매개변수
		radius=r; 
		name=n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle2 pizza = new Circle2(10,"자바피자"); //객체생성
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle2 donut = new Circle2(); //객체 생성시 생성자  Circle2() 호출됨
		donut.name = "도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}

}
