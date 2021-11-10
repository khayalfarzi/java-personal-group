package az.coders.java_lessons.lesson_7.encapsulation;

public class Person {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Age can not be negative number ! \n Please enter valid age parameter");
        else this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
