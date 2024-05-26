package mfaudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest2 extends BrowserBaseTest{
    @Test
    public void browserTest(){

        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.xpath("//body/app-root[1]/nav[1]/button[1]/span[1]")).click();
        driver.findElement(By.cssSelector("nav.navbar.navbar-expand-lg.navbar-light.bg-light:nth-child(1) div.navbar-collapse.collapse.show ul.navbar-nav.mr-auto li.nav-item.active:nth-child(1) > a.nav-link")).click();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)", ""); //scroll
        String text = driver.findElement(By.xpath("//a[contains(text(),'Devops')]")).getText();
        Assert.assertEquals(text, "Devops");


    }

}
