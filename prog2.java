import java.util.*;
class  Student{
    String USN;
    String name;
    int sub;
    int[] marks = new int[10];
    int[] credits = new int[10];
    int gradepoints[] = new int[10];
    double nume =0;
    double denom=0;
    double SGPA;

    void accept()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter USN of student: ");
        USN = sc.nextLine();
        System.out.println("Enter Name of the student: ");
        name = sc.nextLine();
        System.out.println("Enter number of subjects:");
        sub = sc.nextInt();
        
        for(int i=0; i<sub; i++)
        {
            System.out.println("Enter subject "+(i+1)+" marks: ");
            marks[i] = sc.nextInt();
            System.out.println("Enter subject "+(i+1)+" credits: ");
            credits[i] = sc.nextInt();
            denom += credits[i];
         }
     }

     void calculate()
     {
        for(int i=0;i<sub;i++)
        {
            if(marks[i]>=90)
            gradepoints[i]=10;
            else if (marks[i]>= 80 && marks[i]<90)
            gradepoints[i]=9;
            else if (marks[i]>= 70 && marks[i]<80)
            gradepoints[i]=8;
            else if (marks[i]>= 60 && marks[i]<70)
            gradepoints[i]=7;
            else if (marks[i]>= 50 && marks[i]<60)
            gradepoints[i]=6;
            else if (marks[i]>= 40 && marks[i]<50)
            gradepoints[i]=5;
            else
            gradepoints[i]=0;
        
        nume += credits[i]*gradepoints[i];
        SGPA = nume/denom;
}
    }
     void display()
     {
        System.out.println("The student details are:");
        System.out.println("Name:"+name);
        System.out.println("USN: "+USN);
        System.out.println("SGPA:"+SGPA);
     }

}
class prog2{
    public static void main (String args[]) {
        Student s = new Student();
        s.accept();
        s.calculate();
        s.display();
        
    }
}