import java.util.Scanner;
class input
{
    static Scanner sc = new Scanner(System.in);
}
class shape
{
    double area;
    void show_area()
    {
        System.out.println("Area :" +area);
    }
}
class Rectangle extends shape
{
    float l,b;
    Rectangle()
    {
        System.out.println("enter the length and breadth of rectangle");
        l = input.sc.nextFloat();
        b = input.sc.nextFloat();
    }
    void calc()
    {
        area = l*b;
        this.show_area();
    }
}
class circle extends shape
{
    float r;
    circle()
    {
        System.out.println("enter the radius of cicle");
        r = input.sc.nextFloat();
    }
    void calc()
    {
        area = 3.14*r*r;
        this.show_area();
    }
}
public class q4 {
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        r.calc();
        circle c = new circle();
        c.calc();
    }
}