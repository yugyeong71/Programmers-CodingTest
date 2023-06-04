package org.example.Lv1;

/*
    Lv 1. K번째 수
*/

import java.util.*;

public class KNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a, b, c;

        for (int i = 0; i < commands.length; i++){

            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];

            int[] temp = Arrays.copyOfRange(array,a - 1, b);

            Arrays.sort(temp);
            answer[i] = temp[c - 1];
        }

        return answer;
    }

}
