import java.util.Scanner;

class WrongAge extends Exception
{
    public String getMessage()
    {
        return "Age Cannot Be Negative";
    }
}

class InvalidAge extends Exception
{
    public String getMessage()
    {
        return "Son's Age cannot be greater than Father's!";
    }
}
class Father
{
    Scanner s = new Scanner(System.in);
    int f;
    Father() throws WrongAge
    {
        System.out.print("Enter the Father's Age: ");
        f = s.nextInt();
        try
        {
        if(f<0)
            throw new WrongAge();
        }
        catch(WrongAge e1)
        {
            System.out.println(e1.getMessage());
            System.exit(0);
        }
    }
}

class Son extends Father
{
    int son;
    Son() throws WrongAge,InvalidAge
    {
        super();
        System.out.print("Enter the Son's Age: ");
        son = s.nextInt();
        try
        {
        if(son<0)
            throw new WrongAge();
        }
        catch(WrongAge e2)
        {
            System.out.println(e2.getMessage());
        }
        try
        {
        if(son>f)
            throw new InvalidAge();
        }
        catch(InvalidAge e3)
        {
            System.out.println(e3.getMessage());
        }
    }
}

public class prog7
{
    public static void main(String[] args) throws WrongAge,InvalidAge
    {
        new Son();
    }
}