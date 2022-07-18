package chapter03;

public class DoWhileTest {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		do{
			if (i>99) {
				break;
			}
			i=+2;
			sum+=i;
		}while(true);
		System.out.println(sum);
	}
}

