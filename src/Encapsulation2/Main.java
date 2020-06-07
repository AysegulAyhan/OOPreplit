package Encapsulation2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String dop = scan.nextLine();
        int salary = scan.nextInt();

        Employee employee= new Employee();
        employee.setName(name);
        employee.setDob(dop);
        employee.setSalary(salary);
        if (employee.ageCalculator()>18) System.out.println( "Welcome to our company Fernando your salary is "+employee.getSalary());
        else if (employee.ageCalculator()<18) System.out.println("come back when you are 18 years old");
        else if (employee.ageCalculator()==18) System.out.println("we can have inter with you after that you can have a "+employee.getSalary()+"salary");
    }
}
