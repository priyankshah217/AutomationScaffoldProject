package scaffold.pages.ios;

import scaffold.pages.base.HomePage;
import scaffold.pages.base.LoginPage;
import scaffold.utils.PageUtil;

public class HomePageIOS extends HomePage {
    @Override
    public void search() {

    }

    @Override
    public HomePage contactUs() {
        System.out.println("Inside contact us IOS");
        return this;
    }

    @Override
    public LoginPage logout() {
        System.out.println("Inside logout us IOS");
        return PageUtil.getPage(LoginPage.class);
    }
}
