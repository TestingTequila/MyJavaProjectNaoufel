package day27;

public class Calculations
{
    //1. By changing the data type
    public void addition(int a, int b)
    {
        double sum =a+b;
    }
    public void addition(double a, int b)
    {
        double sum =a+b;

    }
    public void addition(double a, double b)
    {
        double sum =a+b;
    }

    //2. By changing the order of data types

    public void addition(int a, double b)
    {
        double sum =a+b;
    }

    //3. By changing the count of parameters
    public void addition(int a, double b, int c)
    {
        double sum =a+b;
    }

}


//Method Overloading --> In a class you can have two or more methods with the same name, provided that their signatures are different

// Different ways to make signatures different
   //1. by changing the data type
   //2. By changing the order of data types
   //3. By changing the count of parameters

// Method Overloading ---> compile time polymorphism/static polymorphism
