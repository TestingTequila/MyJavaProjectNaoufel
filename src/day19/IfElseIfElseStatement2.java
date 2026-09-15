package day19;

public class IfElseIfElseStatement2
{
    static void main() {

        String browserName = "Safari";
        if(browserName.equals("IE"))
        {
            System.out.println("Launch Internet Explorer Browser...");
        }
        else if (browserName.equals("Firefox"))
        {
            System.out.println("Launch Firefox Browser...");
        }
        else if (browserName.equals("Chrome"))
        {
            System.out.println("Launch Chrome Browser...");
        }
        else if (browserName.equals("Safari"))
        {
            System.out.println("Launch Safari Browser...");
        }
        else
        {
            System.out.println("Not a valid browser Name...");
        }
    }
}
