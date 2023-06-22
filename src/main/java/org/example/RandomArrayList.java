package org.example;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList {
    public static ArrayList<Integer> generateRandomArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();


        int length = random.nextInt(91) + 10;


        for (int i = 0; i < length; i++) {
            int randomNumber = random.nextInt();
            arrayList.add(randomNumber);
        }

        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> randomArrayList = generateRandomArrayList();

        // Виводимо ArrayList
        for (int number : randomArrayList) {
            System.out.println(number);
        }
    }
}
