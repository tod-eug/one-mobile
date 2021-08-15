package widgets.following;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Team {
    public static SelenideElement $backButton = $(By.xpath("//*[@resource-id='de.motain.iliga:id/toolbar']//android.widget.ImageButton"));

    public static SelenideElement $teamName = $(By.id("de.motain.iliga:id/header_name"));
    public static SelenideElement $followButton = $(By.id("de.motain.iliga:id/follow_button"));
}
