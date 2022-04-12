import java.util.Scanner;
class info
{
    int r,cgpa;
    String name;
    
}
public class student
{
    public static void main(String args[])
    {
        info i=new info();
        System.out.print("Enter no of student : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("  ");
        System.out.println("Enter " +n+ "student's roll,name and cgpa :--->");
        System.out.println("  ");
        for(int j=0;j<n;j++)
        {
           System.out.println("Roll,name,cgpa of student "+ (j+1) +":");
           i.r=sc.nextInt();
           i.name=sc.next();
           i.cgpa=sc.nextInt();
           System.out.println("  ");
        }
        System.out.println("  ");
        System.out.println("Display " +n+ "student's roll,name and cgpa :");
        for(int j=0;j<n;j++)
        {
           System.out.println("Roll,name,cgpa of student "+ (j+1) +"is :  ");
           System.out.println("Roll-" + i.r);
           System.out.println("Name-" + i.name);
           System.out.println("CGPA-" + i.cgpa);
        }
        info min=new info();
        for(int j=0;j<n;j++)
        {
            if(min.cgpa<i.cgpa)
            {
                min.name=i.name;
                min.r=i.r;
                min.cgpa=i.cgpa;
            }
        }
        System.out.println("  ");
        System.out.println(i.name+" has lowest cgpa ");
        System.out.println("Roll-" + i.r);
        System.out.println("Name-" + i.name);
        System.out.println("CGPA-" + i.cgpa);

    }
}