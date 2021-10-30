package az.coders.java_lessons.lesson_4;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {

        // print given range :
        // for ex:
        // bottom = 12
        // top = 98
        // [12, 13,14, ..., 98]

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Application!");
        System.out.println();

        System.out.print("Bottom: ");
        int bottom = sc.nextInt();

        System.out.print("Top: ");
        int top = sc.nextInt();

        System.out.print("[");
        for (int i = bottom; i <= top; i++) {
            if (i < top)
                System.out.print(i + ", ");
            else
                System.out.print(i);
        }
        System.out.print("]");
    }
}
