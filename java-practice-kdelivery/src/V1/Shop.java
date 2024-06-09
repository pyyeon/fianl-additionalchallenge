package V1;

import java.util.Objects;

public class Shop {
    /**
     * 등록 가능한 음식 수, 음식 초기화 변수, 가격 필드 생성
     * 매장명, 메뉴명, 가격 필드 생성
     */
    private static final int FOOD_MAX = 5;
    private static final String EMPTY_FOOD = "";
    private static final int EMPTY_PRICE = 0;
    private String shopName;
    private static String[] foodNames;
    private static int[] prices;

    /**
     * @Shop() : 생성자 정의
     * 매장만 먼저 입력받도록 합니다.
     * 나머지 변수는 initValues() 에서 정의합니다.
     */
    Shop(String shopName) {
        this.shopName = shopName;
        initValues();
    }

    /**
     * @initValues() : 메뉴명와 가격정보를 담는 배열 생성 및 초기화
     * EMPTY_FOOD = "", EMPTY_PRICE = 0
     */
    static void initValues() {
        foodNames = new String[FOOD_MAX];
        prices = new int[FOOD_MAX];

        for (int i = 0; i < foodNames.length; i++) {
            foodNames[i] = EMPTY_FOOD;
            prices[i] = EMPTY_PRICE;
        }

    }

    /**
     * @addFood() : 위 코드에서 정의된 변수를 받아 출력과 객체에 저장합니다.
     */

    static void addFood(String foodName, int price) {
        //음식 등록?
        //이미 있는지 검사
        for (int i = 0; i < foodNames.length; i++) {
            if (Objects.equals(foodNames[i], EMPTY_FOOD)) {
             continue;
            }
            foodNames[i] = foodName;
            prices[i] = price;
        }

    }

    public void printShop() {
        System.out.println("음식점 이름: " + shopName);
        for (int i = 0; i < FOOD_MAX; i++) {
            if (!foodNames[i].equals(EMPTY_FOOD)) {
                System.out.println("메뉴: " + foodNames[i] + ", 가격: " + prices[i]);
            }
        }
    }
}
