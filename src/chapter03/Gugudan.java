package chapter03;

public class Gugudan {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int k = 1; k  <= 9; k++) {
				System.out.print(i+ "*" + k + "=" + i*k);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
