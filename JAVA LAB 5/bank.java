import java.util.*;
class account
{
    String acc_no;
    double balance;
    public void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account no: ");
        acc_no=sc.next();
        System.out.println("Enter the balance: ");
        balance=sc.nextDouble();        
    }
    public void disp()
    {
      System.out.println("Account no: "+acc_no);  
      System.out.println("Balance: "+balance);
    }
}

class person extends account
{
    String name;
    int aadhar_no;
    public void per_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        name=sc.next();
        System.out.println("Addhar Number: ");
        aadhar_no=sc.nextInt();   
    }
    public void disp()
    {
      System.out.println("Account holder Name: "+name);  
      System.out.println("Addhar Number: "+aadhar_no);
    }
    public void printdetails()
    {
        super.disp();
        disp();
    }
}

public class bank
{
    public static void main(String[] args)
    {
        person a[]=new person[5];
        int n,i;
        Scanner sc=new Scanner(System.in);
        for(i=0; i<a.length; i++)
        {
            a[i]=new person();
        }
        System.out.println("How many details you want to input: ");
        n=sc.nextInt();
        for(i=0; i<n; i++)
        {
            a[i].details();
            a[i].per_details();
            System.out.println();
        }
        System.out.println();
                for(i=0; i<n; i++)
        {
            a[i].printdetails();
            System.out.println();
        }
        System.out.println();
    }
}
