package 실전예제.클래스예제;

public class 클래스만들기 {
    public static void main(String[] args) {
        // 1단계 - 제품번호 제품명, 가격 출력
        System.out.println("1단계");
        System.out.println("상품번호 : D1000, 상품명 : 아메리카노, 가격 : 3000원 입니다");
        System.out.println("상품번호 : H1000, 상품명 : 텀블러, 가격 : 10000원 입니다");

        // 2단계 - 변수 사용해서 출력하기
        String productNo1 = "D1000";
        String productName1 = "아메리카노";
        int price1 = 3000;

        String productNo2 = "H1000";
        String productName2 = "텀블러";
        int price2 = 10000;

        System.out.println("2단계");
        System.out.printf("상품번호 : %s, 상품명 : %s, 가격 : %d원 입니다 \n", productNo1, productName1, price1);
        System.out.printf("상품번호 : %s, 상품명 : %s, 가격 : %d원 입니다 \n", productNo2, productName2, price2);

        // 3단계
        // 지금 있는 상품 가격의 합계 출력
        System.out.println("3단계");
        System.out.printf("상품 가격 총합 : \n" + price1 + price2);

        /**
         * 4단계
         * 상품이 한 두 개면 몰라도 상품이 100개면 100개 * 속성 2개 = 변수 200개 선언해야 함
         * 객체를 만들어서 상품을 담아보자(Product.java 파일에 3가지 속성을 정의해보자)
         */
        // Product.java 객체에 생성자를 정의해보자
        Product p1 = new Product("D1000", "아메리카노", 3000);
        Product p2 = new Product("H1000", "텀블러", 10000);

        // 위에 했던 출력문과 동일한 문구 출력하는 메소드(상품번호 : , 상품명 : , 가격 ~ 입니다)
        p1.print();
        p2.print();

        // 5단계
        // 객체를 관리하는 ProductListRepository를 만들고,
        // Product 객체를 담아서
        // 전체 상품 가격 합계를 출력해본다.

        ProductListRepository repository = new ProductListRepository();

        // ProductListRepository에 Product를 추가하는 메소드를 정의해보자
        repository.add(p1);
        repository.add(p2);

        // 출력함수(ProductListRepository에 함수를 정의해보자)
        repository.sumPrice();

    }
}
