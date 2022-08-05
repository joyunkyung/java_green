package chapter10;

public class ThreadMainEx {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int proirity = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("현재 쓰레드 ID = " + id);
		System.out.println("현재 쓰레드 이름 = " + name);
		System.out.println("현재 쓰레드 우선순위 값 = " + proirity);
		System.out.println("현재 쓰레드 상태 = " + s);
	}

}
