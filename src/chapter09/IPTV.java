package chapter09;
class Tv2 {
	private int size;
	public Tv2(int size) {
		this.size = size;
	}
	protected int getSize(){
		return size;
	}
}
class ColorTv2 extends Tv {
	private int nColor;
	public ColorTv2(int size, int nColor) {
		super(size);
		this.nColor = nColor;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치 " + nColor + "컬러");
	}
}
public  class IPTV extends ColorTv2 {
	private String add;
	public IPTV(String add, int size, int nColor) {
		super(size, nColor);
		this.add =add;
	}
	@Override
	public void printProperty() {
		System.out.println("나의 IPTV는 " + add);
		super.printProperty();
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.12", 32, 2048);
		iptv.printProperty();
	}

}

