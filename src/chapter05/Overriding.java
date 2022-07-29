package chapter05;

class Weapon {
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon {
	protected int fire() {		
		return 10;
	}
}
public class Overriding {
	public static void main(String[] args) {
		Weapon weapon; //클래스 참조변수
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		
		weapon = new Cannon(); //업캐스팅
		System.out.println("대포 무기의 살상 능력은 " + weapon.fire());
	}

}
