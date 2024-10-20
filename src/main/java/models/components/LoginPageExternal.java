package models.components;

public class LoginPageExternal extends LoginPage{
    @Override
    String username() {
        return "username External";
    }

    @Override
    String password() {
        return "password external";
    }

    @Override
    String loginBtn() {
        return "login Btn external";
    }
}
