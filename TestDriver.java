import Pack1.Student;

public class TestDriver {
    public static void main(String[] args) {
        Student s = new Student();
        
        System.out.println("===== ENTER HOSTEL DETAILS =====");
        s.getHostelData();
        
        System.out.println("\n===== ENTER STUDENT DETAILS =====");
        s.getStudentData();
        
        System.out.println("\n===== ENTER DEPARTMENT DETAILS =====");
        s.getDepartmentData();
        
        System.out.println("\n\n===== COMPLETE RECORD =====");
        System.out.println("\n--- HOSTEL INFORMATION ---");
        s.printHostelData();
        
        System.out.println("\n--- STUDENT INFORMATION ---");
        s.printStudentData();
        
        System.out.println("\n--- DEPARTMENT INFORMATION ---");
        s.printDepartmentData();
    }
}
