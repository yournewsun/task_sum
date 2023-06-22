package org.example;


import java.util.ArrayList;

import static org.example.RandomArrayList.generateRandomArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> randomArrayList = generateRandomArrayList();


        System.out.println("Елементи ArrayList:");
        for (int number : randomArrayList) {
            System.out.println(number);
        }


        int sum = 0;
        for (int number : randomArrayList) {
            sum += number;
        }

        System.out.println("Сума елементів: " + sum);
    }
}