package com.codestates.seb.fibonacci;

import java.util.Scanner;

public class Fibonacci_V2 {
    //배열에 담아서 출력
    //앞에 수가 없다면 1대입 > ?
    //출력 메서드
    //피보나치 수열 메서드
    //종료메서드

    static void start(){
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
    }
    static void close(){
        System.out.println("[안내]프로그램을 종료합니다.");
    }

    static void fibonacci(int num){
        int[] f = new int[num];
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
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        start();
        int input = s.nextInt();
        fibonacci(input);
        close();
    }
}
