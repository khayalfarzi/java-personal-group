package az.coders.java_lessons.lesson_8.inheritance;

import java.math.BigDecimal;

public class Employee extends Human {

    private String jobName;

    private BigDecimal salary;

    public Employee(String jobName, BigDecimal salary) {
        this.jobName = jobName;
        this.salary = salary;
    }

    public Employee(String name, String surname, int age, String jobName, BigDecimal salary) {
        super(name, surname, age);
        this.jobName = jobName;
        this.salary = salary;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobName='" + jobName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
