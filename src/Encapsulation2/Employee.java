package Encapsulation2;

import sun.java2d.d3d.D3DDrawImage;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

public class Employee {
    private String name;
    private int salary;
    private String dob ;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDob() {
        return dob;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public  int ageCalculator(){
        LocalDate today=LocalDate.now();
        LocalDate birthday = LocalDate.parse(getDob(), DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        //Period period=Period.between(birthday,today);
         return today.getYear()-birthday.getYear();

    }
}
