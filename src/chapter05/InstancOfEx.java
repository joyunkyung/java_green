package chapter05;

class Person {}
class Student extends Person{}
class Research extends Person{}
class Professor extends Research{}


public class InstancOfEx {
	static void print(Person p) { //Person p = new Student();
		if(p instanceof Person) {
			System.out.print("Person ");
		}
		if(p instanceof Student) {
			System.out.print("Student ");
		}
		if(p instanceof Research) {
			System.out.print("Research ");
		}
		if(p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() --->\t"); print(new Student());
		System.out.print("new Research() --->\t"); print(new Research());
		System.out.print("new Professor() --->\t"); print(new Professor());

	}

}
