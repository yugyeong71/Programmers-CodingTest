package org.example.Lv1;


/*
    Lv 1. 나머지가 1이 되는 수 찾기
*/

public class Remainder1 {

    public int solution(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return -1;
    }

}
