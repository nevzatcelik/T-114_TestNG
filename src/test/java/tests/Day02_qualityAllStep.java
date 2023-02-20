package tests;
// Kullanici https://www.qualitydemy.com sayfasina gider
// basarili bir sekilde login yapar
// categories dropdown dan all courses i secer
// sol kisimdaki alandan filtreleme yaparak English Courses i secer
// Filtreleme yapildigini dogrular
// English Course Learn to Speak dersine tiklar
// Secilen dersi wishliste ekler
// Secilen dersin wishliste eklendigini dogurlar

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Day02_qualityAllStep {

     QualityDemyPage page=new QualityDemyPage();
    @Test
    public void qualityTest(){
        // Kullanici https://www.qualitydemy.com sayfasina gider
        Driver.getDriver().get("https://www.qualitydemy.com");
        // basarili bir sekilde login yapar
        page.cookies.click();
        page.loginLink.click();
        page.emailBox.sendKeys("anevzatcelik@gmail.com");
        page.passwordBox.sendKeys("Nevzat152032");
        page.loginButton.click();
        // categories dropdown dan all courses i secer
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(page.categories).click(page.allCourses).perform();
        // sol kisimdaki alandan filtreleme yaparak English Courses i secer
        page.englishCourseFilter.click();
      // Assert.assertTrue(page.englishCourseFilter.isSelected());
        // Filtreleme yapildigini dogrular
       // System.out.println(page.ccEnglish.getText());
        String expected="English";
        String actual=page.ccEnglish.getText();
        Assert.assertEquals(actual,expected);
        // English Course Learn to Speak dersine tiklar
        page.englishLearnToSpeak.click();
        // Secilen dersi wishliste ekler
        ReusableMethods.bekle(1);
        page.addWihslistButton.click();
        actions.moveToElement(page.wishlistIcon).perform();
        ReusableMethods.bekle(1);
        page.goToWishlist.click();
        // Secilen dersin wishliste eklendigini dogurlar
        Assert.assertTrue(page.englishCourseVerify.isDisplayed());
    }

    @Test
    public void methodluTest(){
       // page.loginMethod();
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(page.categories).click(page.allCourses).perform();
        // sol kisimdaki alandan filtreleme yaparak English Courses i secer
        page.englishCourseFilter.click();
        // Assert.assertTrue(page.englishCourseFilter.isSelected());
        // Filtreleme yapildigini dogrular
        // System.out.println(page.ccEnglish.getText());
        String expected="English";
        String actual=page.ccEnglish.getText();
        Assert.assertEquals(actual,expected);
        // English Course Learn to Speak dersine tiklar
        page.englishLearnToSpeak.click();
        // Secilen dersi wishliste ekler
        ReusableMethods.bekle(1);
        page.addWihslistButton.click();
        actions.moveToElement(page.wishlistIcon).perform();
        ReusableMethods.bekle(1);
        page.goToWishlist.click();
        // Secilen dersin wishliste eklendigini dogurlar
        Assert.assertTrue(page.englishCourseVerify.isDisplayed());
    }
}
