package HRM_Tests;

import Common.TestCommon;
import HrmPages.AdminPage;
import HrmPages.DashBoard_LandingPage;
import HrmPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminPageTest extends TestCommon {
    LoginPage login;
    DashBoard_LandingPage lanPage;
    AdminPage adminPage;
    String User;

    public AdminPageTest() {
        super();
    }

    @BeforeMethod
    public void preTasks() {
        initialisation();
        login = new LoginPage();
        lanPage = new DashBoard_LandingPage();
        adminPage = new AdminPage();
        login.loginHrm();
        lanPage.clickAdmin();

    }
    @Test(priority = 1)
    public void addUser() throws InterruptedException {
        User = adminPage.addUser();
        Assert.assertEquals(User,adminPage.User);
    }
    @Test(priority = 2)
    public  void DeleteUser() throws InterruptedException {
        adminPage.deleteUser();
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }

}
