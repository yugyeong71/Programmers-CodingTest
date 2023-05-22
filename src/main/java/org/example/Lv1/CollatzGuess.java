package org.example.Lv1;

/*
    Lv 1. 콜라츠 추측
*/

public class CollatzGuess {

    public int solution(int num) {
        int answer = 0;

        long number = (long) num;

        if (number == 1){
            return 0;
        }

        while (number != 1) {
            if (number % 2 == 0){
                number /= 2;
            }

            else {
                number = number * 3 + 1;
            }

            answer++;

            if (answer == 500){
                return -1;
            }

        }
        return answer;

    }

}
