package HRM_Tests;

import Common.TestCommon;
import HrmPages.AdminPage;
import HrmPages.DashBoard_LandingPage;
import HrmPages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashBoard_LandingPageTest extends TestCommon {

    LoginPage login;
    DashBoard_LandingPage lanPage;
    AdminPage adminPage;

    public DashBoard_LandingPageTest() {
        super();
    }

    @BeforeMethod
    public void preTasks() {
        initialisation();
        login = new LoginPage();
        login.loginHrm();
        lanPage = new DashBoard_LandingPage();

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
