package mfaudemy;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeDemo extends BaseTest{
    @Test
    public void LongPressGesture(){

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
        Assert.assertEquals(firstImage.getAttribute("focusable"),"true");

        // Swipe
        /*
        Java
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
            "left", 100, "top", 100, "width", 200, "height", 200,
            "direction", "left",
            "percent", 0.75
        ));
         */

        /*
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement)firstImage).getId(),
                "direction", "left",
                "percent", 0.75
        ));
        Bu kod satiri BaseTest sinifinda metod (swipeAction()) olarak tanimlandi ve tekrar tekrar kod yaziminin onune gecildi
         */

        swipeAction(firstImage,"left");

        Assert.assertEquals(firstImage.getAttribute("focusable"),"false");

    }
}
