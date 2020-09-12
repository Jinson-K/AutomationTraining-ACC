package HRM_Tests;

import Common.TestCommon;
import HrmPages.DashBoard_LandingPage;
import HrmPages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestCommon {

    public LoginPageTest(){
        super();
    }

    LoginPage login;
    DashBoard_LandingPage lanPage;

    @BeforeMethod
    public void preTasks(){
        initialisation();
        login = new LoginPage();
    }

    @Test
    public void loginTest(){
        lanPage = login.loginHrm();
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }

    }


