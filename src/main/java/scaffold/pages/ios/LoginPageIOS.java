package scaffold.pages.ios;

import scaffold.pages.base.LoginPage;

public class LoginPageIOS extends LoginPage {
    @Override
    public HomePageIOS login() {
        System.out.println("Inside Login IOS");
        return new HomePageIOS();
    }

    @Override
    public void forgetPassword() {

    }
}
