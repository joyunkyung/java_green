package chapter02;

public class RandomNumber { //주사위 프로그램

	public static void main(String[] args) {
		int n =rollDie();
		System.out.println("주사위의 눈: " + n);
	}
	
	public static int rollDie() {  //타입을 동일하게 지정해줘야함
		double x =6 * Math.random();  //Math.random:난수 0이상 1미만 임의의 실수
		int temp = (int)x; //      double temp = x;
		return temp + 1; 
	}
}
