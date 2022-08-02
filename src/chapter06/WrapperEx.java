package chapter06;

public class WrapperEx {

	public static void main(String[] args) {
		char c1 = '4', c2='F';
		if (Character.isDigit(c1)) { //숫자
			System.out.println(c1 + "는 숫자");
		}else {
			System.out.println(c1 + "는 숫자아님");
		}
		if (Character.isAlphabetic(c1)) { //영문자
			System.out.println(c1 + "는 영문자");
		}else {
			System.out.println(c1 + "는 영문자아님");
		}
		if (Character.isDigit(c2)) { //숫자
			System.out.println(c2 + "는 숫자");
		}else {
			System.out.println(c2 + "는 숫자아님");
		}
		if (Character.isAlphabetic(c2)) { //영문자
			System.out.println(c2 + "는 영문자");
		}else {
			System.out.println(c2 + "는 영문자아님");
		}
		System.out.println(Integer.parseInt("-123"));//문자열->정수
		System.out.println(Integer.toHexString(28)); //16진수
		System.out.println(Integer.toBinaryString(28));//2진수
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(d); //자동 언박싱
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b=(4>3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
	}

}
