package chapter04;

public class Book {
	String title;  //속성
	String author;
	
	public Book(String t) { //생성자
		title=t;
		author="작가미상";
		
	}
	
	public Book(String t, String a) { //생성자
		title=t;
		author=a;
		
	}
	
	public static void main(String[] args) {
		Book littlePrice = new Book("어린왕자","생텍쥐페리");//어린왕자만 있으면 위에꺼 출력 저자까지 있으면 밑에거 출력
		Book loveStory = new Book("춘향전");//춘향전 작가미상
		
		System.out.println(littlePrice.title+" "+littlePrice.author);
		System.out.println(loveStory.title+" "+loveStory.author);

	}

}
