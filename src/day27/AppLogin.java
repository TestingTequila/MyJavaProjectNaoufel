package day27;

public class AppLogin {

    public void login(String email, String password)
    {
        System.out.println("Login using email: " + email + " & Password: " + password);
    }

    public void login(String email, int OTP)
    {
        System.out.println("Login using email: " + email + " & OTP: " + OTP);
    }

    public void login(String applicationAPI)
    {
        System.out.println("Login using API: " + applicationAPI);
    }

    public void login(int mobileNumber, int otp)
    {
        System.out.println("Login using mobile number: " + mobileNumber + " and OTP as: " + otp);
    }

    public void login(int mobileNumber, double otp)
    {
        System.out.println("Login using mobile number: " + mobileNumber + " and OTP as: " + otp);
    }



}
