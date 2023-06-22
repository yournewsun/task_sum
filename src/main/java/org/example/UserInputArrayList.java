package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть числа (введіть 'end', щоб завершити введення):");
        String userInput;
        while (!(userInput = scanner.nextLine()).equals("end")) {
            int number = Integer.parseInt(userInput);
            numbersList.add(number);
        }


        System.out.println("Елементи ArrayList:");
        for (int number : numbersList) {
            System.out.println(number);
        }


        int sum = 0;
        for (int number : numbersList) {
            sum += number;
        }

        System.out.println("Сума елементів: " + sum);
    }
}