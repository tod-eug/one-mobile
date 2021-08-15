package widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Onboarding {
    private static SelenideElement $content = $(By.id("android:id/content"));
    private static SelenideElement $intro = $(By.id("de.motain.iliga:id/onboarding_intro_background"));
    private static SelenideElement $searchField = $(By.id("de.motain.iliga:id/onboarding_search"));
    private static SelenideElement $dontHaveFavorite = $(By.id("de.motain.iliga:id/onboarding_cta"));

    private static ElementsCollection $teamNames = $$(By.xpath("//*[@resource-id='de.motain.iliga:id/following_item_name']"));

    public static void passOnBoarding() {
        $content.shouldBe(Condition.visible);
        $intro.click();
        $searchField.sendKeys("Barcelona");
        $teamNames.find(Condition.text("Barcelona")).click();
        $teamNames.find(Condition.text("Germany")).click();
    }
}
