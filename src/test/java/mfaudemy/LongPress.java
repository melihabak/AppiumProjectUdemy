package mfaudemy;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongPress extends BaseTest{
    @Test
    public void LongPressGesture() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

        /*
        Java
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
            "elementId", ((RemoteWebElement) element).getId()
        ));
        */

        WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));

        //((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
        //        ImmutableMap.of("elementId",((RemoteWebElement) ele).getId(),"duration",2000));
        // Bu iki kod satiri BaseTest sinifinda metod olarak tanimlandi ve tekrar tekrar kod yaziminin onune gecildi

        longPressAction(ele);
        Thread.sleep(2000);

        String menuText = driver.findElement(By.id("android:id/title")).getText();
        Assert.assertEquals(menuText,"Sample menu");
        Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
        Thread.sleep(2000);

    }
}
