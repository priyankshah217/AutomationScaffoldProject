package scaffold.pages.android;

import scaffold.pages.base.HomePage;
import scaffold.pages.base.LoginPage;
import scaffold.utils.PageUtil;

public class HomePageAndroid extends HomePage {
    @Override
    public void search() {

    }

    @Override
    public HomePage contactUs() {
        System.out.println("Inside contact us Android");
        return this;
    }

    @Override
    public LoginPage logout() {
        System.out.println("Inside logout us Android");
        return PageUtil.getPage(LoginPage.class);
    }
}
