package org.example.Lv1;

/*
    Lv 1. 가운데 숫자 가져오기
*/
public class MiddleWord {

    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0){
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }

        else{
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }

        return answer;
    }

}
