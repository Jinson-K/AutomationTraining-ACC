package HrmPages;

import Common.TestCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestCommon {

    @FindBy(name = "txtUsername")
    WebElement userId;
    @FindBy(name = "txtPassword")
    WebElement pswd;
    @FindBy(id = "btnLogin")
    WebElement btnLogin;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public DashBoard_LandingPage loginHrm() {
        userId.sendKeys("Admin");
        pswd.sendKeys("admin123");
        btnLogin.click();
        return new DashBoard_LandingPage();

    }


}
