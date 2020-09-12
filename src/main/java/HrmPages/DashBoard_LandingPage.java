package HrmPages;

import Common.TestCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard_LandingPage extends TestCommon {


    @FindBy(linkText = "Admin")
    WebElement Admintab;

    public DashBoard_LandingPage(){
        PageFactory.initElements(driver,this);
    }

    public AdminPage clickAdmin(){
        Admintab.click();
        return new AdminPage();
    }

}
