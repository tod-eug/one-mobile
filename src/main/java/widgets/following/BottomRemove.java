package widgets.following;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BottomRemove {
    public static SelenideElement $title = $(By.id("de.motain.iliga:id/tutorial_header"));
    public static SelenideElement $keepButton = $(By.id("de.motain.iliga:id/tutorial_button_primary"));
}