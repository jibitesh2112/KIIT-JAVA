import java.util.Scanner;
class Stack
{
    int[] a=new int[10];
    int top=-1;
    void push(int n)
    {
        if(top==9)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            a[top]=n;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("The element popped is "+a[top]);
            top--;
        }
    }
    void top()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("The top element is "+a[top]);
        }
    }
    void empty()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack is not empty");
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.println(a[i]);
            }
        }
    }
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    Stack s=new Stack();
    System.out.println("Enter the number of elements");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter the element");
        int x=sc.nextInt();
        s.push(x);
    }
    s.display();
    s.pop();
    s.display();
    s.top();
    s.empty();
}
}