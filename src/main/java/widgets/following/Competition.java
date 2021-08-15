package widgets.following;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Competition {
    public static SelenideElement $backButton = $(By.xpath("//*[@resource-id='de.motain.iliga:id/toolbar']//android.widget.ImageButton"));

    public static SelenideElement $competitionName = $(By.id("de.motain.iliga:id/toolbar_title"));
    public static SelenideElement $followButton = $(By.id("de.motain.iliga:id/menu_follow"));
}
