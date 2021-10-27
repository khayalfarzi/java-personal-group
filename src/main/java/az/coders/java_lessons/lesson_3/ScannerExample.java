package az.coders.java_lessons.lesson_3;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine(); // xjhvcha

        System.out.printf("Welcome to the Java World %s", name);
    }
}
