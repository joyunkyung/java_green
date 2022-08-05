package chapter09;

class Circle {
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "CiRcle(" + x + "," + y + ")" + "반지름" + radius;
	}
	@Override
	public boolean equals(Object obj) {
		Circle b = (Circle) obj;
		if (x == b.x && y ==b.y ) {
			return true;
		}else {
			return false;
		}
	}
}


public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		
		if (a.equals(b)) {
			System.out.println("같은원");
		}else {
			System.out.println("서로 다른 원");
			
		}

	}

}
