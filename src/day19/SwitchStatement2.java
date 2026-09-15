package day19;

public class SwitchStatement2 {
    static void main() {

        String day = "Tuesday";
        switch (day)
        {
            case "Monday":
                System.out.println("Its Monday, Go to Office");
                break;
            case "Tuesday":
                System.out.println("Its Tuesday, Go to Shop");
                break;
            case "Wednesday":
                System.out.println("Its Monday, meet Family");
                break;
            case "Thursday":
                System.out.println("Its Thursday, Bring Groceries");
                break;
            case "Friday":
                System.out.println("Its Monday, Go to Party");
                break;
            default:
                System.out.println("Its Weekend...lets Enjoy...");
                break;
        }
    }
}


// Switch will not work with >, < >=, <=
// Switch does not support : long, float, double, boolean
// Switch ===> If ElseIf else
// If ElseIf else !===> Switch