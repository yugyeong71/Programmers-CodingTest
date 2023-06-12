package org.example.Lv2;

/*
    Lv 2. 구명보트
*/

import java.util.*;

public class LifeBoat {

    public int solution(int[] people, int limit) {
        int answer = 0;

        List<Integer> boat = new ArrayList<>();

        Arrays.sort(people);

        for (int i = people.length - 1; i > -1; i--){
            boat.add(people[i]);
        }

        for (int i = 0; i < boat.size(); i++){
            int index = -1;

            for (int j = boat.size() - 1; j > i; j--){

                if (boat.get(i) + boat.get(j) > limit){
                    break;
                }

                else {
                    index = j;
                }

            }

            if (index != -1){
                boat.remove(index);
            }

            answer++;

        }

        return answer;
    }

}
