package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers ={2.5, 5, 5.5, -7, 3.5, 9, 7, 4.5};
        boolean negativeNumber = false;
        int count = 0;
        double result = 0;

        for (double number: numbers ) {
            if (number < 0){
                negativeNumber = true;
            }
            if (negativeNumber){
                if (number > 0){
                    result = result + number;
                    count++;

                }
            }
        }
        System.out.println(result/count);
    }
}
