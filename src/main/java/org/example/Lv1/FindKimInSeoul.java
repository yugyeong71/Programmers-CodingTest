package org.example.Lv1;

/*
    Lv 1. 서울에서 김서방 찾기
*/
public class FindKimInSeoul {

    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++){

            if (seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }

        }

        return answer;
    }

}
