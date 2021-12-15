package az.coders.java_lessons.lesson_16.exercise;

import java.util.Objects;

public class Person extends Human {

    private Person mother;
    private Person father;

    public Person(String name, String surname, byte age) {
        super(name, surname, age);
    }

    public Person(String name, String surname, byte age, Person mother, Person father) {
        super(name, surname, age);
        this.mother = mother;
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return mother.equals(person.mother) && father.equals(person.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mother, father);
    }

    @Override
    public String toString() {
        return "Person{" +
                "mother=" + mother +
                ", father=" + father +
                '}';
    }
}
