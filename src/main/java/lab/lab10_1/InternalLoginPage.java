package lab.lab10_1;

public class InternalLoginPage extends LoginPage{
    @Override
    public String username() {
        return "InternalLoginPage | username";
    }

    @Override
    public String password() {
        return "InternalLoginPage | password";
    }

    @Override
    public String loginBtn() {
        return "InternalLoginPage | loginBtn";
    }

}
