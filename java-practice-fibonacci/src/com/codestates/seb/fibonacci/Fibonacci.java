package com.codestates.seb.fibonacci;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args){
    // 1단계. 프로그램 시작을 알리는 출력문 선언

    // 사용자의 입력값 받기.

    // 2단계. 피보나치 수열의 점화식 코드 작성
    // 피보나치 수열의 첫 번째와 두 번째 값을 변수로 정의합니다.

    // 피보니치 수열이 저장될 배열 객체 선언

    // 피보나치 수열의 첫 번째, 두 번째 값 할당

    // 반복문을 통한 피보나치 수열 점화식 작성
    // 해당 점화식은 첫 번째와 두 번째는 구할 필요 없기에 이를 고려한 반복문의 조건식을 작성합니다.
      // 피보나치 수열의 점화식은 n+2번 째 부터 구현.
      // 피보나치 수열의 n+2번 째 값은 (n + n+1)를 통해 구할 수 있습니다.

    // 3단계.
    // 결과 출력을 위한 안내 문구 출력 입니다.

    // 피보나치 수열은 fibonacci 배열에 들어가 있기에 이를 반복문을 통해 호출
Scanner s = new Scanner(System.in);
    System.out.println("[안내]피보나치 수열 프로그램 시작.");
    System.out.print("원하는 수열의 개수를 입력해 주세요 : ");

    int[] f = new int[s.nextInt()];
      //{1, 1, 1 + 1, 1 + (1+1), (1+1)+(1+(1+1)) }
      // 더할 값이 없으면 1 대입 > 1로 초기화?
      int num = 1;
      //f[n+2] = f[n+1] + f[n]
      System.out.println("[피보나치 수열 출력]");
      for (int i = 0; i < f.length; i++){
          if (i == 0 || i == 1){
              f[i] = num;
          }else {
              // (j = i + 1) == (j += -1 + 1)  , i = i - 1 + i - 2
              f[i] = f[i-1] + f[i-2];
          }
          System.out.println(f[i]);
      }

      System.out.println("[안내]프로그램을 종료합니다.");
  }
}