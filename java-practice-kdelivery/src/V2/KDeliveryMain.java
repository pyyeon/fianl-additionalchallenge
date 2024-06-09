package jungmin.kdelivery.V1;

import java.util.ArrayList;
import java.util.Scanner;


// 클래스를 정의 합니다.
public class KDeliveryMain {
    /**
     * 음식점 등록 개수, 음식 주문 가능 횟수, 리뷰 등록 가능 횟수 정의
     */
    private static int SHOP_MAX = 5;
    private static int ORDER_MAX = 5;
    private static int FEEDBACK_MAX = 5;


    /**
     * 배열을 담을 수 있는 객체 생성
     * 사용 범위, 객체 타입, 객체 이름
     */
    private static ArrayList<Shop> shops = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();
    private static ArrayList<Feedback> feedbacks = new ArrayList<>();
    ;


    // 해당 변수를 제어하는 Idx변수를 정의하고 초기화


    private static Scanner s = new Scanner(System.in); // 사용자의 입력을 받는 객체 생성

    /**
     * @KDeliveryMainV1() : 매장 정보, 주문 정보, 리뷰 정보 초기화
     * initValues() 메서드 사용
     * */
//  void KDeliveryMainV1(){
////매장 정보, 주문 정보, 리뷰 정보 초기화
//
//  }

    /**
     * @initValues() : 객체에 저장될 수 있는 크기 지정
     * SHOP_MAX, ORDER_MAX, FEEDBACK_MAX = 5
     * *///리스트로 해도됨
//  void initValues(){
//  }

    /**
     * @close() : 프로그램 종료를 위해 사용되는 메서드
     * 사용자가 종료를 선언하면 동작합니다.
     * main()에서 활용됩니다.
     */
    public static void close() {
        s.close();
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }


    /**
     * selectMainMenu() : 기능을 나열하며, 사용자가 원하는 기능을 정수로 받습니다.
     */

    public static void selectMainMenu(String input) {

        // 번호 입력하는대로 선택
        //값이 저장될 때 마다 shopIdx 값 증가
//input에따라 메소드로 넘기기
        switch (input) {
            case "1":
                selectAddShopMenu();
                break;
            case "2":
                selectDashboardMenu();
                break;
            case "3":
                selectOrderMenu();
                break;
            case "4":
                selectFeedbackMenu();
                break;
            default:
                System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
        }


    }

    /**
     * @selectAddShopMenu() : 음식점의 정보를 등록합니다.
     * @shops : 가게 정보를 저장합니다.
     * @shopIdx : 가게 정보의 인덱스
     */

    public static void selectAddShopMenu() {
        //매장명, 대표메뉴, 메뉴가격 등록
        //가격에 정수만 들어오게
        //shops를 돌면서 해당가게가 존재하는지 찾아야함
        //shopName == 기존의 shop객체의 shopName이 일치하지 않을때만 새로 생성
        //이외에 경우에만 기존 shop에 추가
        //중복해서 등록할 수 없게
        if (shops.size() <= SHOP_MAX) {
            System.out.println("[안내] 반갑습니다. 가맹주님!");
            System.out.println("[안내] 음식점 상호는 무엇인가요?");
            System.out.print(">>>");
            String shopName = s.nextLine();
            System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
            System.out.print(">>>");
            String foodName = s.nextLine();
            System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
            System.out.print(">>>");
            int price = s.nextInt();

            //5번까지 받기
            for (Shop value : shops) {//shops를 돌면서 해당가게가 존재하는지 찾아야함
                Shop shop = null;
                if (value.equals(shopName)) {//shopName == 기존의 shop객체의 shopName이 일치하지 않을때만 새로 생성
//                    Shop existShop = ;
                    System.out.printf("[안내] %s에 음식(%s, %d) 추가되었습니다.\n", shopName, foodName, price);
                    System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.\n");
                    //음식을 더이상 추가할 수 없습니다.
                } else {
                    shop = new Shop(shopName);
                    shop.addFood(foodName, price);
                    System.out.printf("[안내] %s에 음식(%s, %d) 추가되었습니다.\n", shopName, foodName, price);
                    System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.\n");
                }
                shops.add(shop);
            }

        }
        System.out.println("[시스템] 가게 등록할 수 있는 범위를 초과했습니다.\n");

    }
    //

    /**
     * @Shop.java 의 Shop 클래스를 활용한 객체 생성
     * @public 클래스 : 동일 패키지 및 다른 패키지에서 사용가능
     * @addFood() : Shop.java 의 Shop 클래스의 addFood() 메서드
     * 해당 메서드는 매장명, 음식명, 가격을 입력받아 객체에 저장
     * 값이 저장될 때 마다 shopIdx 값 증가
    //     */


    /**
     * @selectDashboardMenu() : 해당 메서드는 등록된 가게 정보를 출력합니다.
     * Feedback.java 파일의 클래스 및 메서드를 활용합니다.
     */

    static void selectDashboardMenu() {
        //주문자, 매장명, 메뉴, 별점 확인
        //feedbacks에 넣어둔걸 출력하는 메소드로 출력할거야.
        for (Feedback feedback : feedbacks) {
            feedback.printInfo();//다 채우면 5개까지 출력
        }
    }


    /**
     * @selectOrderMenu() : 주문 기능
     * 사용자의 입력을 받아 orders 객체에 저장
     */
    static void selectOrderMenu() {
        //주문자, 매장명,메뉴 등록(주문)
        if (orders.size() <= ORDER_MAX) {
            //메뉴가 있는지 검증
            System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!");
            System.out.println("[안내] 주문자 이름을 알려주세요!");
            System.out.print(">>>");
            String customerName = s.nextLine();
            System.out.println("[안내] 주문할 음식점 상호는 무엇인가요?");
            System.out.print(">>>");
            String shopName = s.nextLine();
            System.out.println("[안내] 주문할 메뉴 이름을 알려주세요!");
            System.out.print(">>>");
            String foodName = s.nextLine();
            Order order = new Order(customerName, shopName, foodName);
            orders.add(order);//5번까지 받기
            System.out.printf("[안내] %s님!\n", customerName);
            System.out.printf("[안내] %s 매장에 %s 주문이 완료되었습니다.\n", shopName, foodName);
        }
        System.out.println("[시스템] 5번까지 입력할 수 있습니다.\n");
    }

    /**
     * @selectFeedbackMenu() : 메뉴의 피드백을 입력받는 기능
     */

    static void selectFeedbackMenu() {
        //주문자, 메장명, 메뉴, 별점 등록
        //문자가 아닌걸 입력했을때
        //주문이 존재할때 리뷰작성 가능
        //오더에 주문자, 가게이름, 메뉴이름이 같다면 리뷰작성 가능.
        //null에는 getter 못 씀
        if (feedbacks.size() <= FEEDBACK_MAX) {
            System.out.println("[안내] 고객님! 별점 등록을 진행합니다.");
            System.out.println("[안내] 주문자 이름은 무엇인가요?");
            System.out.print(">>>");
            String customerName = s.nextLine();
            System.out.println("[안내] 음식점 상호는 무엇인가요?");
            System.out.print(">>>");
            String shopName = s.nextLine();
            System.out.println("[안내] 주문하신 음식 이름은 무엇인가요?");
            System.out.print(">>>");
            String foodName = s.nextLine();
            System.out.println("[안내] 음식 맛은 어떠셨나요? (1점 ~ 5점)");
            System.out.print(">>>");
            int grade = s.nextInt();
            Feedback feedback = new Feedback(customerName, shopName, foodName, grade);
            feedbacks.add(feedback);//5번까지 받기
            System.out.println("[안내] 리뷰 등록이 완료되었습니다.\n");
        }
        System.out.println("[시스템] 5번까지 입력할 수 있습니다.\n");
    }


    public static void main(String[] args) {
        String input = "";

        do {
            System.out.println("[치킨의 민족 프로그램 V1]");
            System.out.println("-------------------------");
            System.out.println("1) [사장님 용] 음식점 등록하기");
            System.out.println("2) [고객님과 사장님 용] 음식점 별점 조회하기");
            System.out.println("3) [고객님 용] 음식 주문하기");
            System.out.println("4) [고객님 용] 별점 등록하기");
            System.out.println("5) 프로그램 종료하기");
            System.out.println("-------------------------");
            System.out.println("[시스템] 무엇을 도와드릴까요?\n");
            input = s.nextLine();
            selectMainMenu(input);
        } while (!(input.equals("5")));
        //5가 아니면 돌고 5이면 탈출
        close();
    }
//public  boolean isValidIndex(){
//        int current
//    }

}