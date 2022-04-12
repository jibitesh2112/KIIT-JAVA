import java.util.Scanner;
class lab8q2 {
	public static void main(String[] args) {
		Scanner s = new
		Scanner(System.in);
		int a, b;
		System.out.println("Enter the roll:-"); a = s.nextInt();
		System.out.println("Enter the reg:-"); b = s.nextInt();
		kiitian k = new kiitian(); k.course(a, b);
	}
}
abstract class student {
	public int roll, reg;
	abstract void course(int a, int b);
}
class kiitian extends student {
	void course(int a, int b) {
		roll = a; reg = b;
		System.out.println("Roll No:- " + a + " Reg No:- " + b);
	}
}