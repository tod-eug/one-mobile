package widgets.following;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Following {
    public static SelenideElement $editButton = $(By.id("de.motain.iliga:id/action_edit"));
    public static SelenideElement $doneButton = $(By.id("de.motain.iliga:id/action_done"));

    public static SelenideElement $favoriteClubCard = $(By.id("de.motain.iliga:id/favouriteClubCardContent"));
    public static SelenideElement $favoriteTeamText = $(By.id("de.motain.iliga:id/favouriteNationalTeamTxt"));
    public static SelenideElement $removeFavoriteTeamButton = $(By.id("de.motain.iliga:id/removeFavouriteNationalTeam"));

    public static SelenideElement $followingTeam = $(By.id("de.motain.iliga:id/following_item_name"));
    public static SelenideElement $followingTeamBrowseButton = $(By.xpath("//*[@resource-id='de.motain.iliga:id/followedTeamsSection']//*[@resource-id='de.motain.iliga:id/actionBtn']"));
    public static SelenideElement $followingCompetition = $(By.xpath("//*[@resource-id='de.motain.iliga:id/followedCompetitionsSection']//*[@resource-id='de.motain.iliga:id/following_item_name']"));
    public static SelenideElement $competitionsBrowseButton = $(By.xpath("//*[@resource-id='de.motain.iliga:id/followedCompetitionsSection']//*[@resource-id='de.motain.iliga:id/actionBtn']"));
}
