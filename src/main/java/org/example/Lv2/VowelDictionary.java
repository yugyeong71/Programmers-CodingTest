package org.example.Lv2;

/*
    Lv 2. 모음 사전
*/
public class VowelDictionary {

    public int solution(String word) {
        int answer = word.length();

        char alphabet[] = {'A', 'E', 'I', 'O', 'U'};
        int num[] = {781, 156, 31, 6, 1};

        for (int i = 0; i < word.length(); i++){
            for (int j = 0; j < 5; j++){
                if (word.charAt(i) == alphabet[j]){
                    answer += num[i] * j;
                }
            }
        }

        return answer;
    }

}
