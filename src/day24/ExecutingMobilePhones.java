package day24;

public class ExecutingMobilePhones {
    static void main() {

        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Samsung";
        phone1.modelName = "S14";
        phone1.ramSize = 3.9;
        phone1.price = 4500;
        phone1.IsRefurbished = false;

        System.out.println("====================================");

        MobilePhone phone2 = new MobilePhone();
        phone2.brand = "Apple";
        phone2.modelName = "ProMax";
        phone2.ramSize = 10;
        phone2.price = 8000;
        phone2.IsRefurbished = true;
    }
}
