package org.example.Lv2;

/*
    Lv 2. 다음 큰 숫자
*/
public class NextBigNumber {

    public int solution(int n) {
        int answer = 0;
        int now = Integer.bitCount(n);

        while (true){
            n ++;
            int next = Integer.bitCount(n);

            if (now == next){
                break;
            }
        }

        answer = n;

        return answer;
    }

}
