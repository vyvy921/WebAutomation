Internal Login Page
    #username
    #password
    #loginBtn

External Login page
    .username
    .password
    .loginBtn

input username > inout password > click on Login Btn > User DashBoard
Model > Controller (normal method: reference data/ user-defined class) > Test

** Design
    LoginPage (Abstract)
        InternalPage (extends)
        ExternalPage (extends)

    ControllerLoginPage
        void login(LoginPage){}