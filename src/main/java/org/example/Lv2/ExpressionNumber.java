package org.example.Lv2;

/*
    Lv 2. 숫자의 표현
*/
public class ExpressionNumber {

    public int solution(int n) {
        int answer = 1;

        for (int i = 1; i <= n / 2; i++){
            int sum = i;

            for (int j = i + 1; sum < n; j++){
                sum += j;
            }

            if (sum == n){
                answer++;
            }
        }

        return answer;
    }

}
