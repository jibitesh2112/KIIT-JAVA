import java.util.*;
interface permutation{
  void permutation(int n, int r);
}
interface combination{
  void combination(int n, int r);
}
interface NPRnNCR extends permutation, combination
  {
    void NPRnNCR (int n, int r);
  }
class Main implements NPRnNCR {
  public double fact (double n)
  {
    int i = 1;
    double fact = 1;
    while(i<=n)
      {
        fact = fact * i;
        i++;
      }
    return fact;
  }
  public void permutation(int n, int r)
  {
    double per = fact(n)/fact(n-r);
    System.out.println("Permutation is :" + per);
  }
  public void combination(int n, int r)
  {
    double com = fact(n)/(fact(n-r)*fact(r));
    System.out.println("Combination is :" + com);
  }
  public void NPRnNCR (int n, int r)
  {
    permutation(n,r);
    combination(n,r);
  }
  public static void main (String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the value of n and r :");
    int n = s.nextInt();
    int r = s.nextInt();
    if(n >= r)
    {
      Main d = new Main();
      d.NPRnNCR(n,r);
    }
    else
      System.out.println("n should be greater than or equal to r");
  }
}