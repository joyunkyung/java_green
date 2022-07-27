package chapter04;

public class Song {
	public String title;//속성(필드)
	public String artist;
	public int year;
	public String country;
	
	public Song() {
		
	}
	public Song (String title, String artist, int year, String country) {
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
		
	}
	
	public void show( ) {
		System.out.println(this.year + "년 " + this.country + "국적의 " + 
								this.artist + "가 부른 " + this.title );
	}
	

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		song.show();

	}

}
