package chapter03;

public class WhileTest {

	public static void main(String[] args) {
		int i=1 ;
		int sum = 0 ;
		
		while (i<100) {
			if(i%2==0)
			sum += i; //sum = sum + i
			i++;
		}
		System.out.println(sum); //while문 밖으로 빼야함 (안에 넣으면 값이 반복돼서 출력)
	}

}
