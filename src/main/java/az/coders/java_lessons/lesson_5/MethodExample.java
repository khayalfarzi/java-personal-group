package az.coders.java_lessons.lesson_5;

import java.util.Random;

public class MethodExample {

    public static void main(String[] args) {

        // public static __1__ test (__2__){}

        // 1- return type
        // 2- argument or accept type

        // 4 type

        //1 - return type void arg void
        //2 - return type void arg not void
        //3 - return type not void arg void
        //4 - return type not void arg not void


        firstTypeMethod();
        secondTypeMethod(354);
        int ttm = thirdTypeMethod();
        System.out.println(ttm);
        int ftm = fourthTypeMethod(5);
        System.out.println(ftm);
    }

    public static void firstTypeMethod() {
        System.out.println("This method shouldn't return or accept anything");
    }

    public static void secondTypeMethod(int num) {
        System.out.printf("This method shouldn't return anything but accept type of integer: %s \n", num);
    }

    public static int thirdTypeMethod() {
        Random rnd = new Random();
        int num = rnd.nextInt();
        System.out.printf("This method should return integer: %s but shouldn't accept anything \n", num);
        return num;
    }

    public static int fourthTypeMethod(int num) {
        System.out.printf("This method should return integer and accept integer: %s \n", num);
        return num * num;
    }

}
