package az.coders.java_lessons.lesson_15.lesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx {

    public static void main(String[] args) {

        File file = new File("src/main/resources/MyFirstJavaFile.txt");

        try {
            if (file.createNewFile())
                System.out.println("File is successfully created.");
            else System.out.println("File already exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(file)) {

            writer.write("Welcome to the Java Files world.\n");
            writer.write("Today we are learning Java Files\n");
            writer.write("We are gonna learn how to create files \n");
            writer.write("How to read file, how to write in to the file and itc...\n");

            System.out.println("Successfully written");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner sc = new Scanner(file)) {

            while (sc.hasNext())
                System.out.println(sc.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
