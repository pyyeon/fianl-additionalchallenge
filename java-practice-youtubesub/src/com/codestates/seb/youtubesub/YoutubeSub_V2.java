package com.codestates.seb.youtubesub;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YoutubeSub_V2 {
    static final String admin_id = "admin";
    static final String admin_pw = "0000";
    static Scanner s = new Scanner(System.in);
    /**
     * @static 은 별도의 객체 생성 없이 바로 사용이 가능 합니다.
     * 본 프로그램의 금칙어 리스트와 대체어 리스트를 배열로 정의합니다.
     */
    //비속어, 대체어ㅇ를 맵으로 나타냄
    private static final Map<String, String> wordPurification = new HashMap<>();

    static {
        // 비속어와 비속어를 순화한 단어를 한 쌍으로
        wordPurification.put("킹", "열");
        wordPurification.put("시발", "사랑");
        wordPurification.put("꺼져", "소망");
        wordPurification.put("미친", "희망");
        wordPurification.put("닥쳐", "믿음");
        wordPurification.put("개", "매우");
        wordPurification.put("지랄", "온유");
        //put 으로 비속어와 대체어를 늘릴 수 있음
    }

    static boolean isValid(String id, String pw) {
        if (!id.equals(admin_id) || !pw.equals(admin_pw)) {
            System.out.println("[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.");
            return false;
        }
        return true;
    }

    // 키에 해당하는 단어가 있으면 키값으로 변경
    // entryset > Map에서 모든 Entry(Key-Value)를 가져와 Set객체로 반환
    public static String purifySubtitle(String subtitle) {
        for (Map.Entry<String, String> entry : wordPurification.entrySet()) {
            subtitle = subtitle.replace(entry.getKey(), entry.getValue());
        }
        return subtitle;
    }

    public static void main(String[] args) {
        String badWord = "";
        System.out.print("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
        String id = s.nextLine();
        System.out.print("[시스템] 유튜브 계정의 비밀번호를 입력하세요{Ex - 0000} : ");
        String pw = s.nextLine();

        if (isValid(id, pw)) { //
            System.out.println("[안내] 안녕하세요 " + id + "님.");
            System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");
            String subtitle = s.nextLine();
            if (purifySubtitle(subtitle).equals(subtitle)) {
                System.out.println("[알림] 입력하신 자막에는 금칙어가 없습니다.");
            } else {
                System.out.println("========================================");
                System.out.println("[알림] 자막에 사용된 비속어 리스트입니다.");
                for (String key : wordPurification.keySet()) {
                    System.out.println("금칙어: " + key + " -> 대체어: " + wordPurification.get(key));
                }
                System.out.println("========================================");
                System.out.println("[알림] 자막 순화 프로그램 결과입니다.");
                String newSubtitle = purifySubtitle(subtitle);
                System.out.println("순화된 자막: " + newSubtitle);
            }
        }

    }


}




//사용된 비속어 출력



