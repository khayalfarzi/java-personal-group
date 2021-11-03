package az.coders.java_lessons.lesson_5;

public class JUnitEx {


    public int sqr(int num) {
        return num * num;
    }

    public static int findMaxArr(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int findMax(int num1, int num2) {
        return 0;
    }
}