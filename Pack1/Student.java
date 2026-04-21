package Pack1;

import java.util.Scanner;

public class Student extends Hostel implements Department {
    private String studentName;
    private int regNo;
    private String electiveSubject;
    private double avgMarks;
    
    // Department attributes stored here
    private String depName;
    private String depHead;
    
    // Implementing Department interface methods
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
    
    // Student's own methods
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
    
    // Combined method to get ALL data
    public void getAllData() {
        System.out.println("\n--- Enter Hostel Details ---");
        getHostelData();
        System.out.println("\n--- Enter Student Details ---");
        getStudentData();
        System.out.println("\n--- Enter Department Details ---");
        getDepartmentData();
    }
    
    // Combined method to print ALL data
    public void printAllData() {
        System.out.println("\n===== HOSTEL INFORMATION =====");
        printHostelData();
        System.out.println("\n===== STUDENT INFORMATION =====");
        printStudentData();
        System.out.println("\n===== DEPARTMENT INFORMATION =====");
        printDepartmentData();
    }
}
