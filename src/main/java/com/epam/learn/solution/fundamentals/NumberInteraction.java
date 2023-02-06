package com.epam.learn.solution.fundamentals;

import java.util.Scanner;

public class NumberInteraction {
    Scanner scanner = new Scanner(System.in);
    public void getRandomNumbers() {
        System.out.println("Task 3: Print the given number of random numbers with and without a line break.");
        System.out.println("Enter the number (1 - 10): ");
        int number = scanner.nextInt();
        int[] massiveNumbers = new int[number];
        for (int i = 0; i < massiveNumbers.length; i++) {
            massiveNumbers[i] = (int)(Math.random()*99);
            System.out.print(massiveNumbers[i] + " ");
        }
        System.out.println();
        for (int massiveNumber : massiveNumbers) {
            System.out.println(massiveNumber);
        }
    }
    public void getSumEnteredNumbers(){
        System.out.println("Task 4: Print the sum of all entered numbers.");
        System.out.println("Enter the number: ");
        double sumNumbers = 0;

        for (int i = 0; i < 5; i++) {
            double number = scanner.nextDouble();
            sumNumbers += number;
        }
        System.out.println("Sum of numbers: " + sumNumbers);
    }
    public void getMonthFromGivenNumber(){
        System.out.println("Task 5: Enter a number from 1 to 12. Print the name of the month " +
                "corresponding to the given number in the console. Check if the numbers " +
                "are entered correctly.");
        System.out.println("Enter number from 1 to 12: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1,0 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("In the year 12 months");
        }
    }
}
