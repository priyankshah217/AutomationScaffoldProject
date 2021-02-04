package scaffold;

import org.junit.jupiter.api.Test;
import scaffold.pages.base.LoginPage;
import scaffold.utils.PageUtil;

class LoginTest {

    @Test
    public void successfulLogin() {
        LoginPage loginPage = PageUtil.getPage(LoginPage.class);
        loginPage.login()
                .contactUs()
                .logout();
    }

}