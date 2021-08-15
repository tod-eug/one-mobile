package core.steps;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

/**
 * This file contains steps with swipe realisations.
 */
public class Swipe {

    /**
     * Simple vertical swipe. It gets two parameters: From which point in percent to which will we move "finger".
     * For example if we want to swipe upwards we touch 80% vertical point and move up to 30% of screen height.
     * Horizontal offset coordinate always 2 px.
     * @param fromPercent Integer percentage of tap down point
     * @param toPercent Integer percentage of tap up point
     */
    public static void swipe(Integer fromPercent, Integer toPercent) {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
        TouchAction ta = new TouchAction(driver);
        Dimension dimensions = driver.manage().window().getSize();

        //set Coordinates
        int screenHeightStart = dimensions.getHeight() * fromPercent / 100;
        int screenHeightEnd = dimensions.getHeight() * toPercent / 100;

        ta.press(PointOption.point(2, screenHeightStart)).moveTo(PointOption.point(2, -screenHeightEnd)).release().perform();
    }
}
