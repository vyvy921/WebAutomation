package models.components;

public class LoginPageInternal extends LoginPage {


    @Override
    String username() {
        return "username Internal";
    }

    @Override
    String password() {
        return "password Internal";
    }

    @Override
    String loginBtn() {
        return "Login Internal";
    }
}
