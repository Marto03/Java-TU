public class classCalling
{
    public static void main(String[]args)
    {
        int x = 0;
        A ax = new A();
        ax.X(x);
        A bxA = new B(x);
        bxA.X(x);
        B bxB = new B(x);
        bxB.X(x);
        // A bx = new B(x);
        // B bxB = new B(x);
        // System.out.println(x);
    }


    
}