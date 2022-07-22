package chapter04;

public class TV {
	public String brand;
	public int year;
	public int inch;
	
	public TV(String brand,	int year, int inch) {
		this.brand=brand;
		this.year=year;
		this.inch=inch;
	}
	public void show( ) {
		System.out.println(this.brand+"에서 만든 " + this.year+"년형 "+this.inch+"인치 TV");
	}
	public static void main(String[] args) {
		TV myTV =new TV("LG",2017,32);
		myTV.show();
	}

}
