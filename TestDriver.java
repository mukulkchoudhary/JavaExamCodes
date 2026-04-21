import Pack1.Student;
import java.util.Scanner;

public class TestDriver {
    public static void main(String[] args) {
        Student s = new Student();
        
        System.out.println("===== Enter Student Details =====");
        s.getStudentData();
        
        System.out.println("\n===== Student Information =====");
        s.printStudentData();
    }
}
