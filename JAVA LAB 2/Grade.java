import java.util.Scanner;

    public class grade {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your marks: ");
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks < 90 && marks >= 80) {
                System.out.println("Grade B");
            } else if (marks < 80 && marks >= 70) {
                System.out.println("Grade C");
            } else if (marks < 70 && marks >= 60) {
                System.out.println("Grade D");
            } else if (marks < 60 && marks >= 50) {
                System.out.println("Grade E");
            } else if (marks < 50 && marks >= 40) {
                System.out.println("Grade F");
            } else {
                System.out.println("Failed!");
            }
        }
    }