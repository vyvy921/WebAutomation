package lab.lab10_1;

public class ExternalLoginPage extends LoginPage {
    @Override
    public String username() {
        return "ExternalLoginPage | username";
    }

    @Override
    public String password() {
        return "ExternalLoginPage | password";
    }

    @Override
    public String loginBtn() {
        return "ExternalLoginPage | loginBtn";
    }
}
