package mfaudemy;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollDemo extends BaseTest{
    @Test
    public void ScrollGesture() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        /*
        No prior idea to scroll option
        Java
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 200, "height", 200,
                "direction", "down",
                "percent", 1.0
        ));
        */

        // Where to scroll is known prior
        // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        // Bu kod satiri BaseTest sinifinda metod (scrollForDesiredText()) olarak tanimlandi ve tekrar tekrar kod yaziminin onune gecildi

        // scrollForDesiredText();

        /*
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));
        }while (canScrollMore);
        Bu kod satiri BaseTest sinifinda metod (scrollToEndAction()) olarak tanimlandi ve tekrar tekrar kod yaziminin onune gecildi
        */

        scrollToEndAction();

        Thread.sleep(2000);

    }
}
