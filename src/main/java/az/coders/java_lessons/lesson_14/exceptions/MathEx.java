package az.coders.java_lessons.lesson_14.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MathEx {

    private static final int[] arr = {2, 3, 6, 7, 9, 1, 5, 4, 5, 8, 9, 2};
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IndexOutOfBoundsException, IOException, RuntimeException {

        System.out.print("Enter index: ");
        int index = sc.nextInt();
//        findElementByIndex(index);
        throwAndThrowsMethod();
    }

    public static void findElementByIndex(int index) {
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("An error occurred while processing data!!!");
        } catch (RuntimeException ex) {
            System.out.println("Runtime exception occurred");
        } finally {
            System.out.println("Process ended.");
        }

        throw new RuntimeException("End of method");
    }

    private static void throwAndThrowsMethod() throws RuntimeException, FileNotFoundException {
//        System.out.println(arr[134]);
        File file = new File("");
        FileReader reader = new FileReader(file);
    }
}