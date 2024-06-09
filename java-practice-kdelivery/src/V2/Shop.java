package jungmin.kdelivery.V1;

import java.util.HashMap;

public class Shop {
    /**
     * 등록 가능한 음식 수, 음식 초기화 변수, 가격 필드 생성
     * 매장명, 메뉴명, 가격 필드 생성
     */
    private static final int FOOD_MAX = 5;
    private static final String EMPTY_FOOD = "";
    private static final int EMPTY_PRICE = 0;
    private String shopName;

    private HashMap<String, Integer> shopMenus;

    /**
     * @Shop() : 생성자 정의
     * 매장만 먼저 입력받도록 합니다.
     * 나머지 변수는 initValues() 에서 정의합니다.
     */
    public Shop(String shopName) {
        this.shopName = shopName;
        this.shopMenus = new HashMap<>();
    }

    /**
     * @initValues() : 메뉴명와 가격정보를 담는 배열 생성 및 초기화
     * EMPTY_FOOD = "", EMPTY_PRICE = 0
     */


    /**
     * @return
     * @addFood() : 위 코드에서 정의된 변수를 받아 출력과 객체에 저장합니다.
     */
    void addFood(String foodName, int price) {
//음식추가 음식점개수는 SHOP_MAX넘지 않을때까지
        //shopName에 음식이름이랑 가격 저장
        for (int i = 0; i < FOOD_MAX; i++) {
            if (shopMenus.containsKey(foodName)){
                return ;
            }
            shopMenus.put(foodName, price);
        }
    }


}
