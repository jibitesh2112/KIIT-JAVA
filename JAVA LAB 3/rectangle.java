class Plate
{
    int i, j;
    Plate(int i, int j)
    {
        this.i = i;
        this.j = j;
        System.out.println("Created Plate");
    }
}

class Box extends Plate
{
    int k;
    Box(int i, int j, int k)
    {
        super(i, j);
        this.k = k;
        System.out.println("Created Box");
    }
}

class WoodBox extends Box
{
    int l;
    WoodBox(int i, int j, int k, int l)
    {
        super(i, j, k);
        this.l = l;
        System.out.println("Created WoodBox");
    }
}
public class main {
   public static void main(String arg[])
    {
        System.out.println("---------------");
        Plate x = new Plate(10, 20);
        System.out.println("---------------");
        Box y = new Box(11, 21, 31);
        System.out.println("---------------");
        WoodBox z = new WoodBox(12, 22, 32, 42);
        System.out.println("---------------");
    
    }
}