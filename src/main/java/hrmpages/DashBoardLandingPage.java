package hrmpages;

import common.TestCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardLandingPage extends TestCommon {


    @FindBy(linkText = "Admin")
    WebElement Admintab;

    public DashBoardLandingPage(){
        PageFactory.initElements(driver,this);
    }

    public AdminPage clickAdmin(){
        Admintab.click();
        return new AdminPage();
    }

}
