package com.company;

public class AddDigits {
    public int add(int n) {
        int answer = 0;

        String str = Integer.toString(n);

        for(int i = 0; i < str.length(); i++){
            answer += Integer.parseInt(str.substring(i, i+1));
        }

        return answer;
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();

        System.out.println(addDigits.add(34));
    }
}
