package org.example.Lv2;

/*
    Lv 2. 올바른 괄호
*/
public class CorrectParentheses {
    boolean solution(String s) {
        int startCount = 0;
        int endCount = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                startCount ++;
            } else if (s.charAt(i) == ')'){
                endCount ++;
            }
            if (startCount < endCount){
                return false;
            }
        }

        if (startCount == endCount){
            return true;
        }

        return false;
    }

}
