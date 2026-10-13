package day27;

public class TestECommerceApplication {
    static void main() {
        ECommerceApplication eComm = new ECommerceApplication();
        eComm.search("Samsung");
        eComm.search("Red", "Apple");
        eComm.search("Apple", 5000, 256);
    }
}
