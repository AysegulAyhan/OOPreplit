package Encapsulation1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String studentName = scan.nextLine();

        int studentAge = scan.nextInt();

        // DO NOT CHANGE THE CODE BEFORE THIS LINE.
        Student student= new Student();
        student.setName(studentName);
        student.setAge(studentAge);
        System.out.println(student);

    }}
