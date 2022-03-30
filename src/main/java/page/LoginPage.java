package page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

 

public class LoginPage {

             

WebDriver driver;

             

              public LoginPage(WebDriver driver) {

                             this.driver = driver;

              }

 

              //Element library

              @FindBy(how = How.XPATH,using = "//input[@name='empId']") WebElement EmployeeId_Element;       

              @FindBy(how = How.XPATH,using = "//input[@name='password']") WebElement Password_Element;

              @FindBy(how = How.XPATH,using = "//button[contains(text(), 'Log in')]") WebElement LogIn_Button_Element;

             

              // methods to interact with elements

              public void enterEmployeeId(String EmployeeId) {

                             EmployeeId_Element.sendKeys(EmployeeId);

              }

             

              public void enterPassword(String Password) {

                             Password_Element.sendKeys(Password);

              }

              public void clickLogInButton() {

                             LogIn_Button_Element.click();

              }

             

              public String getPageTittle() {

                             return driver.getTitle();

              }

             

 

}

 