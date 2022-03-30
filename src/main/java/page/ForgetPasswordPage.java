package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgetPasswordPage extends TestBase{

	             

	WebDriver driver;

	             

	              public ForgetPasswordPage(WebDriver driver) {

	                             this.driver = driver;

	              }

	             

	              @FindBy(how = How.XPATH,using = "//button[contains(text(), 'Forget Password')]") WebElement ForgetPassword_Button_Element;

	              @FindBy(how = How.XPATH,using = "//button[contains(text(), 'Continue')]") WebElement Continue_Button_Element;

	              @FindBy(how = How.XPATH,using = "//button[contains(text(), 'Submission')]") WebElement Submission_Button_Element;

	              @FindBy(how = How.XPATH,using = "//input[@name='empId' and @class='form-control']") WebElement EmployeeId_ForgetPassword_Element;

	              @FindBy(how = How.XPATH,using = "//*[@id=\"formHorizontalSecurityQuestion\"]") WebElement Security_Question_Element;

	              @FindBy(how = How.XPATH,using = "//*[@id=\"formHorizontalAnswer\"]") WebElement Security_Question_Answer_Element;

	              @FindBy(how = How.XPATH,using = "//*[@id=\"formHorizontalNewPassword\"]") WebElement New_Password_Element;

	              @FindBy(how = How.XPATH,using = "//*[@id=\"formHorizontalReEnterPassword\"]") WebElement ReEnter_Password_Element;

	             

	 

	public void clickForgetPasswordButton() {

	              ForgetPassword_Button_Element.click();

	}

	 

	public void enterEmployeeId(String EmployeeId) {

	              EmployeeId_ForgetPassword_Element.sendKeys(EmployeeId);

	}

	 

	public void clickContinueButton() {

	              Continue_Button_Element.click();

	}

	public void clickSubmittionButton() {

	              Submission_Button_Element.click();

	}

	 

	public void selectSecurityQuestion(String Question) {

	             

	              selectFromDropdown(Security_Question_Element,Question);

	             

	}

	 

	public void enterAnswer(String Answer) {

	              Security_Question_Answer_Element.sendKeys(Answer);

	}

	 

	public void enterNewPassword(String Password) {

	              New_Password_Element.sendKeys(Password);

	}

	public void reEnterNewPassword(String Password) {

	              ReEnter_Password_Element.sendKeys(Password);

	}

	 

	 

	 

	 

	public String getPageTittle() {

	              return driver.getTitle();

	}

	}

	 

