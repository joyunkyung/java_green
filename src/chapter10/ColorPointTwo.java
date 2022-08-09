package chapter10;

class PointTwo {
	private int x,y;

	public PointTwo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ColorPointTwo extends PointTwo {
	String color;
	public ColorPointTwo() {
		this(0,0);
	}
	public ColorPointTwo(int x, int y) {
		super(x,y);
		this.color = "Black";
	}
	private void setColor(String color) {
		this.color=color;
		
	}

	private void setXY(int x, int y) {
		move(x,y);
		
	}
	@Override
	public String toString() {
		return color + getX() +getY();
	}

//	public static void main(String[] args) {
//		ColorPointTwo zeroPoint = new ColorPointTwo(0, 0, "Black색의 ");
//		System.out.println(zeroPoint.toString() + "의 점입니다" );
//		ColorPointTwo cp = new ColorPointTwo(10,10, "RED");
//		cp.setXY(5,5);
//		cp.setColor("RED색의 ");
//		System.out.println(cp.toString() + "의 점입니다");
//
//	}

}
