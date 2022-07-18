package chapter03;

public class Ex3_5 {

	public static void main(String[] args) {
		int[]  sales = new int[5];  //타입[5] = 5칸
		
		sales[0]=52;
		sales[1]=52;
		sales[2]=52;
		sales[3]=52;
		sales[4]=52;
		
		int sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4];
		System.out.println(sum);
	}

}
