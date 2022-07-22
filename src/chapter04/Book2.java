package chapter04;

public class Book2 {
	String title;  //속성
	String author;
	void show() {System.out.println(title+ " @ " + author);} //littlePrince.show(); show메소드 호출 ->어린왕자,생택쥐페리
	
	
	public Book2() {//기본생성자는 속성 초기화
		this("","");
	}
	
	public Book2(String title) {
		this(title,"작자미상"); //public Book2(String title, String author ) 호출
	}
	
	public Book2(String title, String author ) {
		this.title=title;
		this.author=author;
	}
	
	public static void main(String[] args) {
		//Book2 littlePrince = new Book2(); //this("",""); 출력
		Book2 littlePrince = new Book2("어린왕자","생택쥐페리");
		Book2 loveStory = new Book2("춘향전"); //춘향전 ,작자미상
		Book2 emptyBook = new Book2(); // @
		littlePrince.show(); //show메소드 호출 ->어린왕자,생택쥐페리
		loveStory.show(); //show메소드 호출 ->춘향전 ,작자미상
		emptyBook.show(); //show메소드 호출 -> @
		//System.out.println(littlePrince.title+ " @ " + littlePrince.author); 
	}

}
