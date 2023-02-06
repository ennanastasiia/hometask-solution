package com.epam.learn.solution.fundamentals;

import java.util.Scanner;

public class UserInteraction {
    Scanner scanner = new Scanner(System.in);
    String userName;
    public void getUserName() {
        System.out.println("Task 1: Greet any user when entering their name through the command line.");
        System.out.println("Enter user name: ");
        userName = scanner.nextLine();
        if (!userName.isEmpty()) {
            System.out.println("Hello, " + userName + "!");
        } else System.out.println("User name is empty");
    }
    public void getArgumentsInReversOrder(){
        System.out.println("Task 2: Display the command line arguments in reverse order in the console window.");
        if (!userName.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder(userName);
            stringBuilder.reverse();
            System.out.println("Arguments in revers order: " + stringBuilder);
        } else System.out.println("You didn't enter anything");
    }
}
