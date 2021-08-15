package widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class TapBar {
    public static SelenideElement $news = $$(By.xpath("//*[@resource-id='de.motain.iliga:id/fixed_bottom_navigation_title']")).findBy(Condition.text("News"));
    public static SelenideElement $following = $$(By.xpath("//*[@resource-id='de.motain.iliga:id/fixed_bottom_navigation_title']")).findBy(Condition.text("Following"));
}
