package hrmtests;

import common.TestCommon;
import hrmpages.DashBoardLandingPage;
import hrmpages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestCommon {

    public LoginPageTest(){
        super();
    }

    LoginPage login;
    DashBoardLandingPage lanPage;

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


