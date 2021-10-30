package az.coders.java_lessons.lesson_4;

import java.util.Scanner;

public class FindCharacters {

    public static void main(String[] args) {

        // You have a given word: (ex) "This is the word"

        // Enter the limits: 1-5

        // print: "his i"

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Application!");
        System.out.println();

        // User enter the word which he/she want to split
        System.out.print("Enter word: ");
        String word = sc.nextLine();

        // User enter the limits
        System.out.print("Enter limits (ex: n-m): ");
        String limits = sc.next();

        // Application split high and low limits
        int bottomLimit = Integer.parseInt(limits.substring(0, 1));
        int topLimit = Integer.parseInt(limits.substring(2, 3));

        // Application print the result
        String result = word.substring(bottomLimit, topLimit);
        System.out.printf("The result is: %s", result);
    }
}
