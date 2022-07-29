package chapter05;

public class ArreayparameterEx {
	static void replaceBe(String a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals("be")) {
				a[i] = "eat";
			}
		}
	}
	
	static void printStringArray(String a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String[] str = {"to " ,"be ", "or ", "not ", "to ","be"};
		  
		printStringArray(str);
		replaceBe(str);
		printStringArray(str);

	}

	}


