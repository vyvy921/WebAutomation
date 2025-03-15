package lab.lab10_1;

public abstract class LoginPage {

    public void login(){
        System.out.println(username());
        System.out.println(password());
        System.out.println(loginBtn());
    }
    public void verifyDashboard(){
        System.out.println("Dashboard verified");
    }

    public abstract String username();
    public abstract String password();
    public abstract String loginBtn();
}
