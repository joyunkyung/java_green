package chapter05;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	@Override //시스템 주석
	public void draw() {
		System.out.println("Line");
	
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

public class MethodOverriding {
	static void paint(Shape p) { //Shape p = new Shape();
		p.draw();
	}
	public static void main(String[] args) {
//		Shape shape = new Shape();
//		Line line = new Line();
//		Shape shape = new Line(); //업캐스팅
//		paint(shape); 
//		paint(new Shape());
//		paint(shape); 
		paint(new Rect());
	}

}
