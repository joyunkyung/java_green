package chapter09;

class Tv {
	private int size;
	public Tv(int size) {
		this.size = size;
	}
	protected int getSize(){
		return size;
	}
}
public class ColorTv extends Tv {
	private int nColor;
	public ColorTv(int size, int nColor) {
		super(size);
		this.nColor = nColor;
	}
	public void printProperty() {
		System.out.println(getSize() + "인치 " + nColor + "컬러");
	}
		public static void main(String[] args) {
			ColorTv myTV = new ColorTv(32,1254);
			myTV.printProperty();
		}
	

}