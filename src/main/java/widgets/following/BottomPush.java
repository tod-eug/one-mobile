package widgets.following;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BottomPush {

    public static SelenideElement $title = $(By.id("de.motain.iliga:id/title"));
    public static SelenideElement $doneButton = $(By.id("de.motain.iliga:id/button_primary"));
}
