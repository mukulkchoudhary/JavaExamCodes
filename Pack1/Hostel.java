package Pack1;

import java.util.Scanner;

public class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int noOfRooms;
    
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hostel name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter hostel location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter number of rooms: ");
        noOfRooms = sc.nextInt();
    }
    
    public void printData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + noOfRooms);
    }
}
