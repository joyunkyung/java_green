package chapter02;

public class Cylinder {

	public static void main(String[] args) {
			double r=7;
			double h=5;
			double v = volume(r, h); //메소드(매게변수)
			System.out.println("반지름이 " + r + ", 높이가 " + h+"인 원기둥의 부피: " +v);
	}
	public static double volume(double radius, double height) {
		return Math.PI * radius * radius * height;
	}
}
