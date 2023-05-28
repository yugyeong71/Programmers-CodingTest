package org.example.Lv1;

/*
    Lv 1. 제일 작은 수 제거하기
*/

import java.util.Arrays;

public class SmallestNumberDel {

    public int[] solution(int[] arr) {

        if (arr.length == 1){
            int[] answer = {-1};

            return answer;
        }

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++){
            smallest = Math.min(smallest, arr[i]);
        }

        int[] answer = new int[arr.length - 1];

        int num = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == smallest){
                continue;
            }

            answer[num++] = arr[i];
        }

        return answer;

    }

}
