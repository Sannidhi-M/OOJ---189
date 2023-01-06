import java.util.InputMismatchException;
import java.util.Scanner;

interface Z
{
    public int calc(int a,int b);
}

class Y implements Z
{
    public int calc(int a, int b)
    {
        int c = a/b;
        return c;
    }
}

public class prog6
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Y o = new Y();
        int num1,num2;
        try
        {
            System.out.println("Enter the two numbers: ");
            num1 = s.nextInt();
            num2 = s.nextInt();
            int c = o.calc(num1,num2);
            System.out.println("Quotient: "+c);
        }
        catch(ArithmeticException | InputMismatchException e1)
        {
            System.out.println("Exception: "+e1);
        }
    }
}