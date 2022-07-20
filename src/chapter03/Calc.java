package chapter03;

public class Calc {

	public static void main(String[] args) {
		double sum = 0.0;
		
		for (int i = 0; i < args.length; i++) {
			sum+= Double.parseDouble(args[i]); //Double.parseDouble: 타입변경
}
		System.out.println("합계: "+ sum);

	}

}
