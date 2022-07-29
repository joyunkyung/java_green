package chapter05;

import java.util.Scanner;

public class Trapezoid {
		public int down;
		public int up;
		public int height;
		
		public Trapezoid(int down, int up,int height) {
			this.down =down;
			this.up = up;
			this.height = height;
		}
		public double getArea() {
			return (down+up)*height/2;
		}
		
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> " );
		
		int down = scanner.nextInt();
		int up = scanner.nextInt();
		int height = scanner.nextInt();
		
		Trapezoid area = new Trapezoid(down, up, height );
		System.out.println("사다리꼴의 면적은 " + area.getArea());
	}

}
