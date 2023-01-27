import java.util.Scanner;
abstract class Shape
{
    int a,b;
    abstract void printArea();
}

class Rectangle extends Shape
{
    void printArea()
    {
        int area;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle: ");
        a = s.nextInt();
        b = s.nextInt();
        area = a*b;
        System.out.println("\nArea of Rectangle: "+area+"\n");
    }
}

class Square extends Shape
{
    void printArea()
    {
        int area;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        a = s.nextInt();
        area = a*a;
        System.out.println("\nArea of square: "+area+"\n");
    }
}

class Circle extends Shape
{
    void printArea()
    {
        double area;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        a = s.nextInt();
        area = Math.PI*a;
        System.out.println("Area of Circle: "+area+"\n");
    }
}

public class prog4
{
    public static void main(String[] args)
    {
        int choice;
        Scanner s = new Scanner(System.in);
        do
        {
            System.out.println("1. Calculate Area of Rectangle\n2. Calculate Area of Square\n3. Calculate Area of " +
                    "Circle\n4. Exit the Program\n\nEnter the choice: ");
            choice = s.nextInt();
            switch(choice)
            {
                case 1: Rectangle r = new Rectangle();
                        r.printArea();
                        break;
                case 2: Square sq = new Square();
                       sq.printArea();
                        break;
                case 3: Circle c = new Circle();
                        c.printArea();
                        break;
                case 4: System.out.println("Exiting the program!");
                        System.exit(0);
                        break;
                default: System.out.println("\nInvalid Choice!\n");
            }
        }while(true);
    }
}