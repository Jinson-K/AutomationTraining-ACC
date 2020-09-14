package hrmtests;

import common.TestCommon;
import hrmpages.AdminPage;
import hrmpages.DashBoardLandingPage;
import hrmpages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminPageTest extends TestCommon {
    LoginPage login;
    DashBoardLandingPage lanPage;
    AdminPage adminPage;
    String User;

    public AdminPageTest() {
        super();
    }

    @BeforeMethod
    public void preTasks() {
        initialisation();
        login = new LoginPage();
        lanPage = new DashBoardLandingPage();
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
