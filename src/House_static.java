
class HouseLee {
	//스태틱으로 성 선언
	static String lastname = "이";
	//이름 속성(none-static)
	String name;

	//기본생성자
	HouseLee(){}
	
	//이름 입력
	HouseLee(String name){
		this.name = name;
	}
}

public class House_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseLee 이씨 = new HouseLee();
		
		HouseLee 이국종 = new HouseLee("국종");
		//디버그를 걸어서 이씨와 이국종 모두 lastName이 "이" 인지 확인
		System.out.println(이국종.name);
	}

}
