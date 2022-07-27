package chapter04;

class Circle3{//->default class 클래스 앞에 아무것도 없는 것  , public:접근지정자
	int radius; //속성
	public Circle3(int radius) { //생성자
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}  
 
public class CircleArray { //public class는 파일당 1개	
	public static void main(String[] args) { //main메소드는 public class 안에 있음
		Circle3[] c; // 배열 선언
		c=new Circle3[5]; //참조변수 5개, 여기까지 점
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle3(i); //객체생성->생성자 호출(5번 0~4)
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println((int)c[i].getArea());
		}
	}

}
