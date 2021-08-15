package core.drivers;

import core.Config;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class creates new Android driver. Capabilities gets from capabilities.properties.
 * Appium URL and path to APK file gets from environment.properties.
 */
public class AndroidDriverProvider {

    /**
     * Create new Android driver.
     * @return new Android driver.
     */
    public static WebDriver createDriver() {
        AndroidDriver driver;

        DesiredCapabilities cap = new DesiredCapabilities();

        File apk = new File(Config.configurationProperties.get("APK_PATH"));

        cap.setCapability("deviceName", Config.configurationProperties.get("DEVICE_NAME"));
        cap.setCapability("platformVersion", Config.configurationProperties.get("PLATFORM_VERSION"));
        cap.setCapability("platformName", Config.configurationProperties.get("PLATFORM_NAME"));
        cap.setCapability("appPackage", Config.configurationProperties.get("APP_PACKAGE"));
        cap.setCapability("appActivity", Config.configurationProperties.get("APP_ACTIVITY"));
        cap.setCapability("app", apk.getAbsolutePath());
        cap.setCapability("automationName", Config.configurationProperties.get("AUTOMATION_NAME"));
        cap.setCapability("fullReset", Boolean.parseBoolean(Config.configurationProperties.get("FULL_RESET")));
        cap.setCapability("noReset", Boolean.parseBoolean(Config.configurationProperties.get("NO_RESET")));

        try {
            driver = new AndroidDriver(new URL(Config.configurationProperties.get("APPIUM_URL")), cap);
            return driver;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
