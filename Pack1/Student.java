package Pack1;

import java.util.Scanner;

public class Student extends Hostel implements Department {
    private String studentName;
    private int regNo;
    private String electiveSubject;
    private double avgMarks;
    
    public void getData() {
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
    
    public void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        System.out.println("Department Name: " + depName);
        System.out.println("Department Head: " + depHead);
    }
    
    public void getStudentData() {
        getHostelData();
        getData();
    }
    
    public void printStudentData() {
        printHostelData();
        printData();
    }
}
