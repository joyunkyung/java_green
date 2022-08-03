package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); //object에 홍길동 넣음		
		String name = (String)box.get(); //다운캐스팅
		System.out.println(name);
		
		box.set(new Apple());//Apple()객체를 생성해서  object에 넣음
		Apple apple =(Apple) box.get(); //다운캐스팅
		System.out.println(apple);
	}
}
