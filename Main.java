import java.util.*;
import java.lang.Math;

class Main{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the values of a,b,c");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = b*b-4*a*c;
        double r1, r2;
        if (a==0) {
            System.out.println("Not a quadratic equation");
            }
        else if (d==0){
            System.out.println("Roots are equal.");
            r1 = r2 = -b/(2*a);
            System.out.println ("Root 1 and Root 2 are:  "+r1);
        }
        else if (d>0){
            System.out.println ("Roots are real and distinct.");
            r1 = (-b + Math.sqrt(d))/(2*a);
            r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println ("Root 1: "+r1);
            System.out.println ("Root 2: " +r2);
        }

        else {
            System.out.println ("Roots are imaginary");
            r1 = (-b/2*a);
            r2 = (Math.sqrt(-d))/(2*a);
            System.out.println ("Root 1: " +r1 + "+i" +r2);
            System.out.println ("Root 2: " +r1 + "-i" +r2);
        }
    }
}
