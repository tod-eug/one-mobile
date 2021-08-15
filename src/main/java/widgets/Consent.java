package widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Consent {
    static SelenideElement $consentTitle = $(By.id("de.motain.iliga:id/consentTitleTxt"));
    static SelenideElement $agreeButton = $(By.id("de.motain.iliga:id/confirmTxt"));

    public static void passConsent() {
        Consent.$consentTitle.shouldBe(Condition.visible);
        Consent.$agreeButton.click();
    }
}
