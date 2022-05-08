
class MathTest {
	int getAverage(int first, int second) {
		return Math.round((first + second) / 2);
	}
	
	//세번째 시험 점수를 추가해서 평균을 구하는 getAverage 작성
}

public class 오버로딩 {

	public static void main(String[] args) {
		MathTest math1 = new MathTest();
		
		System.out.println(math1.getAverage(50, 80));
		
		//첫번째 ~ 세번째 시험 점수 평균도 출력하기
		
	}

}
