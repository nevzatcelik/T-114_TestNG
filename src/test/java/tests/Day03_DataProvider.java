package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.ConfigReader;

public class Day03_DataProvider {
    QualityDemyPage page=new QualityDemyPage();

    @DataProvider
    public static Object[][] gonderilecekMail(){
        Object [][] gonderilecekMailvePassword={
                {ConfigReader.getProperty("yanlismail"),ConfigReader.getProperty("yanlispassword")},
                {ConfigReader.getProperty("yanlismail1"),ConfigReader.getProperty("yanlispassword1")},
                {ConfigReader.getProperty("yanlismail2"),ConfigReader.getProperty("yanlispassword2")},
                {ConfigReader.getProperty("yanlismail3"),ConfigReader.getProperty("yanlispassword3")},
                {ConfigReader.getProperty("dogrumail"),ConfigReader.getProperty("dogrupassword")}};
        return gonderilecekMailvePassword;
    }


    @Test(dataProvider = "gonderilecekMail")
    public void qualityTest(String gonderilecekMail,String gonderilecekPassword){
        page.loginMethod(gonderilecekMail,gonderilecekPassword);
    }
}
