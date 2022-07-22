package chapter03;

public class Throws {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (Exception e) {
			System.out.println("클래스가 존재x");
		}
	}
		
		public static void findClass() throws ClassNotFoundException{//클래스를 찾을 수 없을 때 발생하는 오류
			Class.forName("java.lang.String"); //forName(): 클래스를 찾는 메소드,위에 못찾으면 catch로 받음
			
		}

}
