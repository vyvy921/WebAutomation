package models.components;

public abstract class LoginPage {

    public void login() {
        System.out.println(username());
        System.out.println(password());
        System.out.println(loginBtn());
    }

    public void verifyLoginSuccess(String password) {
        System.out.println("Verifying Dashboard display");
    }

    abstract String username();

    abstract String password();

    abstract String loginBtn();
}