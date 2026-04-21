import Pack1.Student;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {
        Student s = new Student();
        
        System.out.println("===== ENTER HOSTEL DETAILS =====");
        s.getData();
        
        System.out.println("\n===== ENTER STUDENT AND DEPARTMENT DETAILS =====");
        s.getData();
        
        System.out.println("\n===== HOSTEL INFORMATION =====");
        s.printData();
        
        System.out.println("\n===== STUDENT AND DEPARTMENT INFORMATION =====");
        s.printData();
    }
}
