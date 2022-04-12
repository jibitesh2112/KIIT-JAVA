import java.util.Scanner;
class Swap   
{  
    public static void main(String a[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner swap = new Scanner(System.in);  
         
        int x = swap.nextInt();  
        int y = swap.nextInt();  
        System.out.println("before swapping numbers: "+x +" "+ y);    
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
    }   
}