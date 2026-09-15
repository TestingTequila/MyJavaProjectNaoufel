package day19;

public class SwitchStatement {
    static void main() {

        String browserName = "Safari";

        switch (browserName) {
            case "IE":
                System.out.println("Launch Internet Explorer browser...");
                break;
            case "Firefox":
                System.out.println("Launch Firefox browser...");
                break;
            case "Chrome":
                System.out.println("Launch Chrome browser...");
                break;
            case "Safari":
                System.out.println("Launch Safari browser...");
                break;
            default:
                System.out.println("Not a valid browser Name....");
                break;
        }
    }
}


// Switch will not work with >, < >=, <=
// Switch does not support : long, float, double, boolean