package V1;

public class Feedback {
  private String customerName;
  private String shopName;
  private String foodName;
  private int grade;

  /**
   * @Feedback() : 정보를 저장합니다
   */
Feedback(String customerName, String shopName, String foodName, int grade){
  this.customerName = customerName;
  this.shopName = shopName;
  this.foodName = foodName;
  this.grade = grade;
}


  /**
   * @getStars() : 사용자가 입력한 점수가 별점으로 전환
   */
  Object getStars(int score){


    String star = "*";
    String stars = "";

    for (int i = 0; i < score; i++) {
      stars += star;
      //"*",  **, ****

    }
      return stars;
  }

  /**
   * @printInfo() : 출력
   */
public void printInfo(){
  // 어디 음식점 메뉴이름 별점
  // for문 돌려서 메뉴 있으면 출력 , empty어쩌구면 출력 안함
  System.out.println(customerName + " [고객님]");
  System.out.println("-------------------------");
  System.out.println("주문 매장 : " + shopName);
  System.out.println("주문 메뉴 : " + foodName);
  System.out.println("별점 : " + getStars(grade));
  System.out.println("-------------------------");

}

}
