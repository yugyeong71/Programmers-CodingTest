package com.company;

public class CalculateAverage {
    public double Average(int[] arr) {
        double answer = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        answer = (double)sum/arr.length;
        return answer;
    }

    public static void main(String[] args){
        CalculateAverage calculateAverage = new CalculateAverage();

        int[] a = {1, 2, 3};

        System.out.println(calculateAverage.Average(a));
    }
}
