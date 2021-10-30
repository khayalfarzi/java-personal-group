package az.coders.java_lessons.lesson_4;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean key = true;

        while (key) {

            System.out.print("Enter key: ");
            String word = sc.next();

            if (word.equalsIgnoreCase("close"))
                key = false;
        }
    }
}
