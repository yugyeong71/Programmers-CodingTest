package org.example.Lv0;

public class SheepSkewers {

    public int solution(int n, int k) {
        int answer = 0;

        answer = (n * 12000) + ((k - (n / 10)) * 2000);

        return answer;
    }

}
