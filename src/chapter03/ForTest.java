package chapter03;

public class ForTest {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 0; i < 100; i++) {  //짝수 i+=2
			if(i%2 == 1) continue;
			sum+=i;	
			
		}
		
		System.out.println(sum);
	}

}
