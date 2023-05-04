package org.example.Lv1;

import java.util.Arrays;
import java.util.Collections;

/*
    Lv 2. 정수 내림차순으로 배치하기
*/
public class IntegerDesc {

    public long solution(long n) {
        long answer = 0;

        String str = Long.toString(n);
        String[] arr = str.split("");

        Arrays.sort(arr, Collections.reverseOrder());
        str = String.join("", arr);

        answer = Long.parseLong(str);

        return answer;
    }

}
