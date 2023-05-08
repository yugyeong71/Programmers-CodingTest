package org.example.Lv1;

/*
    Lv 1. 핸드폰 번호 가리기
*/
public class CoverPhoneNumber {

    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++){
            if (i < phone_number.length() - 4){
                answer += "*";
            }
            else {
                answer += phone_number.charAt(i);
            }
        }

        return answer;
    }

}
