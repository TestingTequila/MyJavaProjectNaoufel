package day25;

public class MethodConcepts3
{
    int marks;

    public  void getStudentsGrades()
    {
        if(marks>=90)
        {
            System.out.println("Grade O");
        }
        else if (marks>=80 && marks<90)
        {
            System.out.println("Grade A++");
        }
        else if (marks>=70 && marks<80)
        {
            System.out.println("Grade A++");
        }
        else if (marks>=60 && marks<70)
        {
            System.out.println("Grade A++");
        }
        else if (marks>=50 && marks<60)
        {
            System.out.println("Grade A++");
        }
        else
        {
            System.out.println("Work Hard.....");
        }
    }
}
