package day26;

public class Microsoft
{
    // Whatever be the salary of the employee, every employee will get a Christmas bonus of  $3000

    //1. Calculate employee Salary [basicAllowance & TravelAllowance]

    public double calculateSalary(double basicAllowance, double travelAllowance)
    {
        double salary=basicAllowance + travelAllowance;
        System.out.println("Salary Before Bonus: $" + salary);
        return  salary;
    }
}
