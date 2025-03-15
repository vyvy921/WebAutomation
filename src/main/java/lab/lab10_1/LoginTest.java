package lab.lab10_1;

public class LoginTest {

    public static void main(String[] args) {

        LoginPage internalLoginPage = new InternalLoginPage();
        LoginPage externalLoginPage = new ExternalLoginPage();

        LoginTest test = new LoginTest();
        test.loginController(internalLoginPage);
        test.loginController(externalLoginPage);
    }

    public void loginController(LoginPage loginPage){
        loginPage.login();
        loginPage.verifyDashboard();
    }

}
