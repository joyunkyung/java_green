package chapter05;

public class Main {
	public static void main(String[] args) {
		Animal a;
//		a = new Animal(); //추상클래스는 객체생성x
		Bird b;
//		b = new Bird(); //추상클래스는 객체생성x
//		Penguin p;
//		p = new Penguin(); //일반클래스
		Penguin	p = new Penguin();
		p.swim();
		Bird p2 = new Penguin(); //업캐스팅
		p2.walk();
		Penguin p3 = (Penguin) p2; //다운캐스팅
		p3.swim();
		
//		Duck d = new Duck();
		Bird d = new Duck(); //업캐스팅
		d.eat();
		Duck d2 = (Duck) d; //다운캐스팅
		d2.fly();
		d2.swim();
		
		Animal d3 = new Duck(); //업캐스팅
		int x = d3.life; //x=1
		System.out.println("x====> " + x);
		
//		Swim s = new Swim2(); //인터페이스는 객체생성x
		Swim2 s = new Penguin(); //형태만 업캐스팅
		s.swim();
		
		
		Swim2[] s2 = new Swim2[2]; //참조변수 2개 생성(객체생성이 아님)
		s2[0] = new Penguin(); //객체생성
		s2[1] = new Duck(); //객체생성
//		s2[2] = new Duck();
		
	}
}
