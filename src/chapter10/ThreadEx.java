package chapter10;

class ThreadEx1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("i: " + i);
		}
	}
}
class ThreadEx2 implements Runnable {
	@Override
	public void run() {
		for (int j = 0; j <15; j++) {
			System.out.println("j: " + j);
		}
	}
}
public class ThreadEx {

	public static void main(String[] args) {
		ThreadEx1  t1 = new ThreadEx1();
		Runnable r = new ThreadEx2();
		Thread t2 = new Thread(r);
		t1.start(); 
		t2.start();
	}

}
