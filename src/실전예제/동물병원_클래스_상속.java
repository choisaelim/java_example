package 실전예제;

class Animal {
	String name;

	Animal() {
	}

	// 이름과 나이를 입력받는 기본 생성자 만들기
	Animal(String name) {
		this.name = name;
	}

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	void sleep() {
		System.out.println("sleep " + this.name);
	}
}

class HouseDog extends Dog {
	void sleep() {
		System.out.println("sleep in house " + this.name);
	}
}

public class 동물병원_클래스_상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		// Animal의 메소드 생성 가능
		dog.setName("bow");
		dog.sleep();

		HouseDog houseDog = new HouseDog();
		houseDog.setName("pow");
		houseDog.sleep();

	}

}
