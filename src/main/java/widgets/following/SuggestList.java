package widgets.following;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SuggestList {
    public static SelenideElement $title = $(By.id("de.motain.iliga:id/toolbar_title"));
    public static SelenideElement $subTitle = $(By.id("de.motain.iliga:id/section"));
    public static ElementsCollection $list = $$(By.xpath("//*[@resource-id='de.motain.iliga:id/item_name']"));
}