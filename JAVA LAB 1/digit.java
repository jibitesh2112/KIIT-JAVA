import java.util.Scanner;
class digit
{
   public static void main(String args[])
   {
       int n,a,b,c;
       Scanner digit = new Scanner(System.in);
       n = digit.nextInt();
       System.out.print("Enter Digit: "); 
        a=n%10;
        b=(n/10)%10;
        c=(n/100)%10;
        System.out.print("digit= "+ a+"  "+ b+"  "+ c);
   }
}