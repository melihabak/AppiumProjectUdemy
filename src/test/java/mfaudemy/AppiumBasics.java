package mfaudemy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics {

    @Test
    public void AppiumTest() throws MalformedURLException {

        // Code to start server
        // Android Driver, iOS Driver
        // Appium Code -> Appium Server -> Mobile

        AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File("\\C:\\Users\\melih.abak\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js\\"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();

        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554"); // Real Device or Emulator
        options.setApp("C:\\Users\\melih.abak\\Desktop\\AppiumProjectUdemy\\src\\test\\java\\resources\\ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

        // Actual automation

        driver.quit();
        service.stop();
        // Stop server

    }
}
