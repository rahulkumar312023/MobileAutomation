package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppTest {
    private AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "local");
        desiredCapabilities.setCapability("appium:udid", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:appPaakage", "com.androidsample.generalstore");
        desiredCapabilities.setCapability("appium:appActivity", "com.androidsample.generalstore.MainActivity");

        URL remoteUrl = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void  testGeneralStoreAPK(){
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
        driver.findElement();
    }
}
