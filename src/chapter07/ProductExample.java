package chapter07;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();	
		product1.setKind(new Tv()); //Tv()객체가 참조변수에 들어감
		product1.setModel("스마트TV");//model에 스마트TV
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();//tvModel안에 스마트TV
		System.out.println(tv);
		System.out.println(tvModel);
		
		Product<Car, String> product2 =new Product<>(); //T(참조변수):Car, M(필드):String
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind(); //car 참조변수가 Car 객체를 가리킴
		String carModel = product2.getModel();//carModel안에 디젤
		System.out.println(car);
		System.out.println(carModel);
		}
}
