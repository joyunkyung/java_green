package chapter06;

class Point {
	private int x,y;
	public Point(int x, int y) { 
		this.x=x;
		this.y=y;	
	}
}
public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode()); //값이 pc마다 다를수 있음
		System.out.println(obj.toString()); //객체값->문자열변환 (10진수->16진수)
		System.out.println(obj);//obj.toString()과 동일
	}
	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
	} 

}
