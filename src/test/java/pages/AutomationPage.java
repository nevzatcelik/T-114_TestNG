package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signupLink;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameBox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement enterText;

    public void automationMethod(){
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        signupLink.click();
        nameBox.sendKeys("mehmet");
        emailBox.sendKeys("mehmet@gmail.com");
        signUpButton.click();
    }
}
