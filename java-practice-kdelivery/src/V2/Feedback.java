package V2;

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
  System.out.println();
}

}
