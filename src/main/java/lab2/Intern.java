package lab2;

public class Intern extends Employee {

    public static final double MAX_SALARY = 2000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("Salary exceeds maximum");
        }
        super.setSalary(salary);

    }


}
