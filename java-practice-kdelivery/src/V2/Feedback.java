package V2;

import java.util.HashMap;
import java.util.Map;

public class Feedback {
  private String customerName;
  private String shopName;
  private String foodName;
  private int grade;





  /**
   * @Feedback() : 정보를 저장합니다
   */
  Feedback(String customerName, String shopName, String foodName,int grade) {
    this.customerName = customerName;
    this.shopName = shopName;
    this.foodName = foodName;
    this.grade = grade;
  }

  /**
   * @getStars() : 사용자가 입력한 점수가 별점으로 전환
   */
  public String getStars(int score){
    //숫자 -> 별점으로

    Map ratingOptions = new HashMap();
    ratingOptions.put(0, "☆☆☆☆☆");
    ratingOptions.put(1, "★☆☆☆☆");
    ratingOptions.put(2, "★★☆☆☆");
    ratingOptions.put(3, "★★★☆☆");
    ratingOptions.put(4, "★★★★☆");
    ratingOptions.put(5, "★★★★★");
    String stars = (String) ratingOptions.get(score);

    return stars;  //입력한 숫자 ->key(키값)
  }

  /**
   * @printInfo() : 출력
   */
  void printInfo(){
    System.out.printf("%s [고객님]%n", customerName);
    System.out.println("-------------------------");
    System.out.println("주문 매장 : " + shopName);
    System.out.println("주문 메뉴 : " + foodName);
    System.out.println("별점 : " + getStars(grade));
  }






}
