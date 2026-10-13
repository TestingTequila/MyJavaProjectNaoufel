package day27;

public class TestAppLogin {
    static void main() {
        AppLogin appLogin = new AppLogin();
        appLogin.login("jason.roger@janbask.com", "test@1234");
        appLogin.login(3454343, Math.random());
    }
}
