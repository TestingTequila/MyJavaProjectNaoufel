package day26;

public class TestIdCard {
    static void main() {
        IdCard ic = new IdCard();
        String fName =ic.printEmpName("Donald", "Trump");
        System.out.println("Name on IdCard is: " + fName+ " MEDMA");
    }
}
