package widgets;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Main {
    public static SelenideElement $newsFeed = $(By.id("de.motain.iliga:id/cms_gallery"));
}
