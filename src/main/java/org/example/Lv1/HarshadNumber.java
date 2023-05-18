package org.example.Lv1;

/*
    Lv 1. 하샤드 수
*/
public class HarshadNumber {

    public boolean solution(int x) {
        int num = x;
        int sum = 0;

        while (num != 0){
            sum += num % 10;
            num /= 10;
        }

        if (x % sum == 0){
            return true;
        }

        else {
            return false;
        }

    }

}
