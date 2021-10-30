package az.coders.java_lessons.lesson_4;

import java.util.Scanner;

public class ForExWarmup {

    public static void main(String[] args) {

        // row = 3
        // column = 4

        /*
         *
         *  * * * *
         *  * * * *
         *  * * * *
         *
         * changes
         * */

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int clmn = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < clmn; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
