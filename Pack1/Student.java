package Pack1;

import java.util.Scanner;

public class Student extends Hostel implements Department {
    private String studentName;
    private int regNo;
    private String electiveSubject;
    private double avgMarks;
    public String depName;
    public String depHead;
    
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
        sc.nextLine();
        
        System.out.print("Enter department name: ");
        depName = sc.nextLine();
        
        System.out.print("Enter department head: ");
        depHead = sc.nextLine();
    }
    
    public void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        System.out.println("Department Name: " + depName);
        System.out.println("Department Head: " + depHead);
    }
}
