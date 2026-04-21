import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n===== 3D OBJECT CALCULATOR =====");
            System.out.println("1. Box");
            System.out.println("2. Cube");
            System.out.println("3. Cylinder");
            System.out.println("4. Cone");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double w = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    
                    Box box = new Box(l, w, h);
                    System.out.println("Surface Area: " + box.wholeSurfaceArea());
                    System.out.println("Volume: " + box.volume());
                    break;
                    
                case 2:
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    
                    Cube cube = new Cube(side);
                    System.out.println("Surface Area: " + cube.wholeSurfaceArea());
                    System.out.println("Volume: " + cube.volume());
                    break;
                    
                case 3:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double hCyl = sc.nextDouble();
                    
                    Cylinder cylinder = new Cylinder(r, hCyl);
                    System.out.println("Surface Area: " + cylinder.wholeSurfaceArea());
                    System.out.println("Volume: " + cylinder.volume());
                    break;
                    
                case 4:
                    System.out.print("Enter radius: ");
                    double rCone = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double hCone = sc.nextDouble();
                    
                    Cone cone = new Cone(rCone, hCone);
                    System.out.println("Surface Area: " + cone.wholeSurfaceArea());
                    System.out.println("Volume: " + cone.volume());
                    break;
                    
                case 5:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);
        
        sc.close();
    }
}
