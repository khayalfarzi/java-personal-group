package az.coders.java_lessons.lesson_8.inheritance;

import java.math.BigDecimal;

public class Engineer extends Employee {

    private BigDecimal bonus;

    public Engineer(String jobName, BigDecimal salary) {
        super(jobName, salary);
    }

    public Engineer(String name, String surname, int age, String jobName, BigDecimal salary) {
        super(name, surname, age, jobName, salary);
    }

    public Engineer(String jobName, BigDecimal salary, BigDecimal bonus) {
        super(jobName, salary);
        this.bonus = bonus;
    }

    public Engineer(String name, String surname, int age, String jobName, BigDecimal salary, BigDecimal bonus) {
        super(name, surname, age, jobName, salary);
        this.bonus = bonus;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "bonus=" + bonus +
                '}';
    }
}
