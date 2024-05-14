package mfaudemy;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class AppiumBasics extends BaseTest{
    @Test
    public void WiFiSettingsTest() throws MalformedURLException {

        // Actual automation
        // XPath, id, accessibilityId, classname, androidUIAutomator
        // tagName = [@attribute='value'] is syntax for XPath
        // Set WiFi
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        //driver.findElement();

    }
}
