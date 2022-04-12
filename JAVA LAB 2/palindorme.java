import java.util.Scanner;

public class palindrome {
        public static void main(String[] args) {
            Scanner sc= new Scanner (System.in);
            int b=0,c=0;
            System.out.print("Enter a 3-digit number: ");
            int n=sc.nextInt();
            int temp=n;
            b=n%10;
            c=n/100;
            if(b==c)
                System.out.println(temp+" is a palindrome number");
            else
                System.out.println(temp+" is not a palindrome number");
        }
    }