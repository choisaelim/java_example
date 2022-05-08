class Product {
	static int count = 0;
	
	{
		count++;
	}
	
	Product(){}
	
	static int getCount() {
		return count;
	}
}

public class 제품생산_static {

	public static void main(String[] args) {
		//static으로 메소드를 선언하면 객체를 생성하지 않고도 메소드 접근 가능
		System.out.println("전체 제품 수 : " + Product.getCount());
		
		
		//1. Product 하나를 생성한다.
		Product p1 = new Product();
		System.out.println("p1 create");
		System.out.println("전체 제품 수 : " +p1.count);
		
		//2. 두번째 Product를 생성한다.
		Product p2 = new Product();
		System.out.println("p2 create");
		//count는 static이므로 Product 내에서 동일한 값을 공유한다.
		//static 변수는 객체 내에서 한 번만 생성된다.
		System.out.println("전체 제품 수 : " +p2.count);
		
	}

}
