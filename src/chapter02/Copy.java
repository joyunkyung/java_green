package chapter02;

public class Copy {
	public static void main(String[] args) {
		String origin = "�����ٶ�";
		String copy = origin;
		System.out.println(origin);
		System.out.println(copy);
		
		copy = copy + "���ٻ�";
		System.out.println(copy);
	}
}