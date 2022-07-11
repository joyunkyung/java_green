package chapter02;

public class FloatDoubleExample {

	public static void main(String[] args) {
//		float var1 = 3.14; //실수 기본형은 double이라서 오류 f/F붙이면 가능
		float var1 = 3.14f;
		double var2 = 3.14;
		float var3 = 0.12345678901234567890f;
		float var4 = 0.9876543210987654321f;
		double var5 = 0.12345678901234567890;
		double var6 = 0.9876543210987654321;
		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 = 3e-3;
		
		
		System.out.println("var1: "+ var1);
		System.out.println("var2: "+ var2);
		System.out.println("var3: "+ var3);
		System.out.println("var4: "+ var4);
		System.out.println("var5: "+ var5);
		System.out.println("var6: "+ var6);
		System.out.println("var7: "+ var7);
		System.out.println("var8: "+ var8);
		System.out.println("var9: "+ var9);
	}

}
