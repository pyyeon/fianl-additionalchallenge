package com.codestates.seb.Ai_V3;

public class Ai_V3 {
  public static void main(String[] args) {
    //TODO:
    /*
     * 프로그램에 필요한 변수 선언
     * xy_lists       : 데이터를 담을 2차원 배열
     * diff           : 편차
     * diff_pow       : 편차의 제곱(double)
     * diff_pow_float : 편차의 제곱(float)
     * sum_diff_pow   : 편차 제곱의 합
     * */

    // 프로그램 안내 문구 출력
    System.out.println("[인공지능 프로그램 V3]");
    System.out.println("==============================");
    System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");
    // 1단계 2차원 배열 데이터 생성
    double[][] arr = {{374.0, 1161.0}, {385.0, 1401.0}, {375.0, 1621.0}, {401.0, 1681.0}};
    // 데이터 출력 안내 문구 생성

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d번째 데이터) [실제값] 웹 페이지 방문자 수 : %.1f "
              + "\n            [인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n", i+1, arr[i][0], arr[i][1]);
    }
    // 2단계, 3단계
    double error;
    double squaredError;
    double sum = 0;
    for (int i  = 0; i < arr.length; i++) {
      error = arr[i][0] - arr[i][1];
      squaredError = Math.pow(error,2);
      sum += squaredError;
      System.out.printf("[%d 번째 데이터] 실제 값과 예측값의 오차 : %.1f\n", i+1, error);
      System.out.printf("[안내] 오차의 제곱 : %.1f \n", squaredError );
    }   // 배열 속 값을 호출하며 편차 -> 제곱 -> 합산 과정을 수행합니다.
    System.out.println("==============================");
    System.out.println("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : " + sum);
  }
}