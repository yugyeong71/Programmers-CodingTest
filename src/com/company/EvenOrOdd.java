package com.company;

public class EvenOrOdd {

    public String EvenOdd(int num) {

        String answer = "";

        if(num % 2 == 0){
            answer = "Even";
        }

        else{
            answer = "Odd";
        }

        return answer;
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();

        System.out.println(evenOrOdd.EvenOdd(5));
    }
}
