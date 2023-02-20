package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemyPage {
    public QualityDemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookies;

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginLink;

    @FindBy(xpath = "//*[@placeholder='Email']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@placeholder='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement categories;

    @FindBy(xpath = "(//*[text()='All courses'])[1]")
    public WebElement allCourses;

    @FindBy(xpath = "(//*[text()='English Course'])[2]")
    public WebElement englishCourseFilter;

    @FindBy(xpath = "(//*[text()='English'])[2]")
    public WebElement ccEnglish;

    @FindBy(xpath = "(//*[@href=\"https://www.qualitydemy.com/home/course/english-course-learn-to-speak/3\"])[2]")
    public WebElement englishLearnToSpeak;

    @FindBy(xpath = "//button[@class='btn btn-add-wishlist ']")
    public WebElement addWihslistButton;

    @FindBy(xpath = "(//div[@class='icon'])[3]")
    public WebElement wishlistIcon;

    @FindBy(xpath = "//*[text()='Go to wishlist']")
    public WebElement goToWishlist;

    @FindBy(xpath = "(//*[text()='English Course Learn To Speak'])[2]")
   public WebElement englishCourseVerify;

    public void loginMethod(String mail,String password){
     Driver.getDriver().get("https://www.qualitydemy.com");
     // basarili bir sekilde login yapar
    if (cookies.isDisplayed()){
     cookies.click();
     loginLink.click();
     emailBox.sendKeys(mail);
     passwordBox.sendKeys(password);
    } else {
     loginLink.click();
     emailBox.sendKeys(mail);
     passwordBox.sendKeys(password);
    }
    loginButton.click();
    }
}
