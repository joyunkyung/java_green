package chapter07;

public class BoxExample2 {
	public static void main(String[] args) {
		Box2<String> box1 = new Box2<String>();
		box1.set("hello");
//		box1.set(new Integer(10));
		String greet = box1.get();//greet안에 hello
		System.out.println(greet); 
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(6);
		int vlaue = box2.get();//value에 6
		System.out.println(vlaue); 
	}
}
