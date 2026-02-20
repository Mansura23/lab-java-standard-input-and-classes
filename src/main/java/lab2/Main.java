package lab2;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Employee emp1 = new Employee("Ali", "ali@mail.com", 25, 3500);
        Employee emp2 = new Employee("Leyla", "leyla@mail.com", 28, 4200);
        Employee emp3 = new Employee("Murad", "murad@mail.com", 30, 5000);
        Employee emp4 = new Employee("Nigar", "nigar@mail.com", 22, 2800);
        Employee emp5 = new Employee("Kamran", "kamran@mail.com", 35, 6000);
        Employee emp6 = new Employee("Aysel", "aysel@mail.com", 27, 3900);
        Employee emp7 = new Employee("Rauf", "rauf@mail.com", 40, 7500);
        Employee emp8 = new Employee("Sevda", "sevda@mail.com", 24, 3100);
        Employee emp9 = new Employee("Tural", "tural@mail.com", 29, 4700);
        Employee emp10 = new Employee("Gunel", "gunel@mail.com", 26, 3600);

        try (FileWriter fw = new FileWriter("employee.txt", true);) {
            fw.write("Name: " + emp1.getName() + " Email: " + emp1.getEmail() +
                    " Age: " + emp1.getAge() + " Salary: " + emp1.getSalary() + "\n");

            fw.write("Name: " + emp2.getName() + " Email: " + emp2.getEmail() +
                    " Age: " + emp2.getAge() + " Salary: " + emp2.getSalary() + "\n");

            fw.write("Name: " + emp3.getName() + " Email: " + emp3.getEmail() +
                    " Age: " + emp3.getAge() + " Salary: " + emp3.getSalary() + "\n");

            fw.write("Name: " + emp4.getName() + " Email: " + emp4.getEmail() +
                    " Age: " + emp4.getAge() + " Salary: " + emp4.getSalary() + "\n");

            fw.write("Name: " + emp5.getName() + " Email: " + emp5.getEmail() +
                    " Age: " + emp5.getAge() + " Salary: " + emp5.getSalary() + "\n");

            fw.write("Name: " + emp6.getName() + " Email: " + emp6.getEmail() +
                    " Age: " + emp6.getAge() + " Salary: " + emp6.getSalary() + "\n");

            fw.write("Name: " + emp7.getName() + " Email: " + emp7.getEmail() +
                    " Age: " + emp7.getAge() + " Salary: " + emp7.getSalary() + "\n");

            fw.write("Name: " + emp8.getName() + " Email: " + emp8.getEmail() +
                    " Age: " + emp8.getAge() + " Salary: " + emp8.getSalary() + "\n");

            fw.write("Name: " + emp9.getName() + " Email: " + emp9.getEmail() +
                    " Age: " + emp9.getAge() + " Salary: " + emp9.getSalary() + "\n");

            fw.write("Name: " + emp10.getName() + " Email: " + emp10.getEmail() +
                    " Age: " + emp10.getAge() + " Salary: " + emp10.getSalary() + "\n");

        }

       


    }
}
