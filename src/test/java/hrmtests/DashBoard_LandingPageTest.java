package hrmtests;

import common.TestCommon;
import hrmpages.AdminPage;
import hrmpages.DashBoardLandingPage;
import hrmpages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashBoard_LandingPageTest extends TestCommon {

    LoginPage login;
    DashBoardLandingPage lanPage;
    AdminPage adminPage;

    public DashBoard_LandingPageTest() {
        super();
    }

    @BeforeMethod
    public void preTasks() {
        initialisation();
        login = new LoginPage();
        login.loginHrm();
        lanPage = new DashBoardLandingPage();

    }

    @Test
    public void ClickAdmin() {
       adminPage = lanPage.clickAdmin();

    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }

}
