package mfaudemy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics {

    @Test
    public void AppiumTest() throws MalformedURLException {

        // Code to start server
        // Android Driver, iOS Driver
        // Appium Code -> Appium Server -> Mobile
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("R68R9042DXV"); // Real Device or Emulator
        options.setApp("C:\\Users\\melih.abak\\Desktop\\AppiumProjectUdemy\\src\\test\\java\\resources\\ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.quit();

    }
}
