package com.koulab.hackersbar;

import com.codeborne.selenide.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.*;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {

        Configuration.headless =  false;
        Configuration.reportsFolder = "build/reports";
        Configuration.browserSize = "1228x601";
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "chrome";

        open("https://hackers.bar/recruit/");
        WebDriverRunner.getWebDriver().switchTo().activeElement().sendKeys(Keys.ENTER,"Hackers Bar");
    }
}
