package org.example.Lv1;

/*
    Lv 1. 문자열 내림차순으로 배치하기
*/

import java.util.Arrays;

public class StringDesc {

    public String solution(String s) {
        String answer = "";

        char[] str = s.toCharArray();

        Arrays.sort(str);

        for (int i = str.length - 1; i >= 0; i--){
            answer += str[i];
        }

        return answer;
    }

}
