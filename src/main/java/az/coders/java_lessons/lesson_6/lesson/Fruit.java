package az.coders.java_lessons.lesson_6.lesson;

public class Fruit {

    // field, variable, property
    public String name;

    public String color;

    public double weight;

    public double price;

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}