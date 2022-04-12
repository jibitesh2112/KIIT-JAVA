package general;

public class Employee {
protected int empid;
private String ename;
private double basic, DA, HRA;
public Employee(String n, int id, double b) {
ename = n;
basic = b;
empid = id;
DA = b * 0.8;
HRA = b * 0.5;
}
public double earnings() {
return basic + DA + HRA;
}
public void printName() {
System.out.println("Name: " + ename);
}
}

package marketing;
import java.util.*;
import general.*;
class Saless {
public static double tallowance(double e) {
return e * 0.05;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the Name,employee id and basic salary : ");
String name = sc.nextLine();
int id = sc.nextInt();
double sal = sc.nextDouble();
Employee obj1 = new Employee(name, id, sal);
obj1.printName();
double e = obj1.earnings();
System.out.println("Earnings : " + e);
System.out.println("Travel allowance : " + tallowance(e));
System.out.println("Employee ID : " + id);
sc.close();
}
}
