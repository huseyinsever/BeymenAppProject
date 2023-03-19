package Util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static AndroidDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AndroidDriver initialize_Driver(String browser){
        properties =ConfigReader.getProperties();
        capabilities = new DesiredCapabilities();
        if (browser.equals("Android")){
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("deviceName","emulator-5554");
            capabilities.setCapability("appPackage","com.mobisoft.beymen");
            capabilities.setCapability("appActivity","com.mobisoft.beymen.activity.SplashActivity");
        }
        else if (browser.equals("IOS")){
            capabilities.setCapability("platformName","IOS");
            capabilities.setCapability("deviceName","");
            capabilities.setCapability("appPackage","");
            capabilities.setCapability("appActivity","");

        }
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        int impWait=Integer.parseInt(properties.getProperty("implicitlyWait"));
        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);


        return getDriver();
    }
    public static AndroidDriver getDriver(){
        return driver;

    }
}
