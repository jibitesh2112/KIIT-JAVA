import java.util.Scanner;
class BioData {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter Name:-");
        String name = data.nextLine();
        System.out.println("Enter Roll no:-");
        int roll=data.nextInt();      
        System.out.println("Enter Weight:-");
        int weight=data.nextInt();
        System.out.println("Enter Height:-");
        int height=data.nextInt();
        System.out.println("Date of birth:-");
        int date=data.nextInt();
        int month=data.nextInt();
        int year=data.nextInt();
        System.out.println("Enter age:-");
        int age = data.nextInt();
    System.out.println("Name: " + name);
    System.out.println("Roll: " + roll);
    System.out.println("Weight: " + weight); 
    System.out.println("Height: " + height);
    System.out.println("Age:- " + age);
    System.out.println("D.O.B: " + date+" / "+ month+" / "+ year); 
    }
}