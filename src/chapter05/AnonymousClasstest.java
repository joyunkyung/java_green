package chapter05;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnonymousClasstest {

	public static void main(String[] args) {
//		new RemoteControl()
		RemoteControl rc = new RemoteControl() { //무명클래스(이름만 빌려옴)

			@Override
			public void turnOn() {
				System.out.println("Tv turnOn()");				
			}

			@Override
			public void turnOff() {
				System.out.println("Tv turnOff()");			
			}
		};
		rc.turnOn();
		rc.turnOff();

	}

}
