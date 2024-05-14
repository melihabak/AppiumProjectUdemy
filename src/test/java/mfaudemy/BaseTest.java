package mfaudemy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {

        // Code to start server
        // Android Driver, iOS Driver
        // Appium Code -> Appium Server -> Mobile

        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("\\C:\\Users\\melih.abak\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js\\"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();

        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554"); // Real Device or Emulator
        options.setApp("C:\\Users\\melih.abak\\Desktop\\AppiumProjectUdemy\\src\\test\\java\\resources\\ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
        service.stop();
        // Stop server
    }
}
