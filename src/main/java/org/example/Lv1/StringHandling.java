package org.example.Lv1;

/*
    Lv 1. 문자열 다루기
*/
public class StringHandling {

    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6){
            for (int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if (ch < '0' || ch > '9') {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

}
