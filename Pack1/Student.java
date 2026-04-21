package Pack1;

import java.util.Scanner;

public class Student extends Hostel implements Department {
    private String studentName;
    private int regNo;
    private String electiveSubject;
    private double avgMarks;
    private String depName;
    private String depHead;
    
    public void getStudentData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        studentName = sc.nextLine();
        System.out.print("Enter registration number: ");
        regNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter elective subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Enter average marks: ");
        avgMarks = sc.nextDouble();
    }
    
    public void printStudentData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }
    
    public void getDepartmentData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department name: ");
        depName = sc.nextLine();
        System.out.print("Enter department head: ");
        depHead = sc.nextLine();
    }
    
    public void printDepartmentData() {
        System.out.println("Department Name: " + depName);
        System.out.println("Department Head: " + depHead);
    }
}
