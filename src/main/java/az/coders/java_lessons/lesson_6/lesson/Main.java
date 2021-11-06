package az.coders.java_lessons.lesson_6.lesson;

public class Main {

    public static void main(String[] args) {

        Fruit apple = new Fruit();
        apple.name = "Quba almasi";
        apple.color = "Red";
        apple.weight = 25.42;
        apple.price = 1.40;

        Fruit banana = new Fruit();
        banana.name = "Africa Banani";
        banana.color = "Yellow";
        banana.weight = 32.22;
        banana.price = 2.5;

        System.out.printf("Apple  : %s \n", apple);
        System.out.printf("Banana : %s\n", banana);
    }
}
