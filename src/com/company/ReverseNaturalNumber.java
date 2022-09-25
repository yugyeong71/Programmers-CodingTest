package com.company;

import java.util.Arrays;

public class ReverseNaturalNumber {
    public int[] solution(long n) {
        long num = n;
        int cnt = 0;

        while(num != 0){
            num /= 10;
            cnt++;
        }

        int[] answer = new int[cnt];

        num = n;

        for(int i = 0; num != 0; i++){
            answer[i] = (int)(num % 10);
            num /= 10;
        }

        return answer;
    }

    public static void main(String[] args){
        ReverseNaturalNumber reverseNaturalNumber = new ReverseNaturalNumber();

        System.out.print(Arrays.toString(reverseNaturalNumber.solution(12345)));
    }
}
