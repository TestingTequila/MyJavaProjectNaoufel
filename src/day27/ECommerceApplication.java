package day27;

public class ECommerceApplication
{
    public void search(String brand)
    {
        System.out.println("Searching..... " + brand + " mobile");
    }

    public void search(String brand,int price)
    {
        System.out.println("Searching.....  " + brand + " mobile" + " in the price $" + price);
    }

    public void search(String brand,int price, int RAM)
    {
        System.out.println("Searching.....  " + brand + " mobile" + " in the price $" + price + " having memory " + RAM +"GB");
    }

    public void search(String color, String brand)
    {
        if(color.equals("Red"))
        {
            System.out.println("No such mobile Found...");
        }
        else {
            System.out.println("Searching.....  " + color + "  color " + brand + " mobile");
        }
    }
}
