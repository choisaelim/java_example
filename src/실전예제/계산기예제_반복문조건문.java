package 실전예제;

import java.util.Random;
import java.util.Scanner;

public class 계산기예제_반복문조건문 {
	public static void main(String[] args) {
		// switch case 조건문, if문 사용
		// scanner, print 함수 사용

		/**
		 * 사용자가 입력한 문자열 받는 방법
		 * Scanner scan = new Scanner(System.in);
		 * String str = scan.nextLine();
		 * 
		 * 랜덤객체 생성하고 1부터 11까지 난수 생성하는 방법
		 * Random rd = new Random();
		 * int i = rd.nextInt(10) + 1; //0부터 10까지 뽑은 난수에 + 1을 해서 i에 담는다
		 * 
		 * //switch case 예제
		 * switch (str) {
		 * case "+":
		 * //System.out.println(" ");
		 * break;
		 * 
		 * default:
		 * break;
		 * }
		 */

		// 1. 스캐너 객체를 생성한다.

		// 2. "연산자를 입력하세요" 라고 출력한다.

		// 3. 문자열 변수에 사용자가 입력한 문자를 대입한다. (스캐너로 받은 것, nextLine 사용)

		// 4. int 변수 두 개에 랜덤한 숫자를 각각 담는다. (nextInt 사용)

		// 5. 랜덤으로 받은 숫자 출력(숫자1은 10입니다, 숫자 2는 8입니다)

		// 6. 입력받은 문자가 + - * 중 하나인지 확인

		// 7. 조건문을 만들고 + - * 가 아니면 "연산자를 입력하세요" 라고 출력한다.

		// 8. 7의 경우가 아니면 조건문을 만들어, (switch case 추천)
		// 생성된 숫자를 입력받은 연산자로 계산한 결과를 출력한다. (10 + 8은 18입니다)

	}

}
