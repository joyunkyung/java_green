package chapter04;

public class ArrayParameterEx {
	static void printCharArray(char a[]) { //메소드
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	static void replaceCharArray(char a[]) { //메소드
		for (int i = 0; i < a.length; i++) {
			if(a[i] == ' ') {
				a[i] = ',';
			}
			
		}
	}
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceCharArray(c);
		printCharArray(c);
	}

}
