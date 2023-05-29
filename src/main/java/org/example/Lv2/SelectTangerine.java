package org.example.Lv2;

import java.util.*;

/*
    Lv 2. 귤 고르기
*/

public class SelectTangerine {

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int count = k;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++){
            if (map.get(tangerine[i]) == null){
                map.put(tangerine[i], 1);
            }

            else {
                int temp = (int)map.get(tangerine[i]);
                map.put(tangerine[i], temp+1);
            }
        }

        List<Map.Entry<Integer, Integer>> mapList = new ArrayList<>(map.entrySet());
        mapList.sort((x, y) -> y.getValue().compareTo(x.getValue()));

        for (Map.Entry<Integer, Integer> entry : mapList){
            if (count <= 0){
                break;
            }

            else {
                answer++;
                count -= entry.getValue();
            }
        }

        return answer;

    }

}
