package az.coders.java_lessons.lesson_4;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        // Find Maximum number between 3 different numbers

        // The task is :
        // User enter 3 number . For ex:
        // first = 23
        // second = 56
        // third = 12

        // The result is : 56

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Application!");

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        System.out.printf("The result is : %s", Math.max(Math.max(first, second), third));
    }
}
