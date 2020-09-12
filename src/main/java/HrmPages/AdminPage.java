package HrmPages;

import Common.TestCommon;
import org.apache.http.impl.client.StandardHttpRequestRetryHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AdminPage extends TestCommon {
  public String UserName = "Test28456";
    public  String User;

@FindBy(id="btnAdd")
WebElement BtnAdd;

@FindBy(id="systemUser_employeeName_empName")
WebElement EmpNameField;

@FindBy(id="systemUser_userName")
WebElement UsrNameFiled;

@FindBy(id="systemUser_password")
WebElement UsrpswdField;

@FindBy(id="systemUser_confirmPassword")
WebElement UsrConPswdFiled;

@FindBy(id="btnSave")
WebElement BtnSave;

@FindBy(id="btnDelete")
WebElement DeleteBtn;

@FindBy(id="dialogDeleteBtn")
WebElement DialogDeleteBtn;



public AdminPage(){
    PageFactory.initElements(driver,this);
}

public String addUser() throws InterruptedException {

    BtnAdd.click();
    Thread.sleep(3000);
    EmpNameField.sendKeys("Thomas Fleming");
    UsrNameFiled.sendKeys(UserName);
    UsrpswdField.sendKeys("Test@123");
    UsrConPswdFiled.sendKeys("Test@123");
    Thread.sleep(3000);
    BtnSave.click();
    Thread.sleep(3000);
    User= driver.findElement(By.xpath("//a[contains(text(),'" + UserName + "')]")).getText();
    return User;
}

public void deleteUser() throws InterruptedException {
    driver.findElement(By.xpath("//a[contains(text(),'" + UserName + "')]//parent::td//preceding-sibling::td//input[@name='chkSelectRow[]']")).click();
    Thread.sleep(3000);
    DeleteBtn.click();
    Thread.sleep(3000);
    DialogDeleteBtn.click();
}

}
