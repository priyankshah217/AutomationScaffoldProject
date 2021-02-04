package scaffold.pages.android;

import scaffold.pages.base.LoginPage;

public class LoginPageAndroid extends LoginPage {

    @Override
    public HomePageAndroid login() {
        System.out.println("Inside Login Android");
        return new HomePageAndroid();
    }

    @Override
    public void forgetPassword() {

    }
}
