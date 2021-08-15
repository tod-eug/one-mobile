import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import core.Config;
import core.drivers.AndroidDriverProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import widgets.Consent;
import widgets.Onboarding;
import widgets.TapBar;
import widgets.following.*;

import static core.steps.Swipe.swipe;

@RunWith(JUnit4.class)
public class FollowingPageTests {

    /**
     * In this method before each test we do next steps:
     *  * configure framework
     *  * pass onBoarding
     *  * pass consent agreement
     *  * go to Following page
     */
    @Before
    public void setUp() {
        Config.setUp();
        WebDriverRunner.setWebDriver(AndroidDriverProvider.createDriver());
        Configuration.timeout = 6000;

        Onboarding.passOnBoarding();
        Consent.passConsent();
        TapBar.$news.shouldBe(Condition.visible);
        TapBar.$following.click();
        Following.$favoriteClubCard.shouldBe(Condition.visible);
    }


    /**
     * Check choosing favorite club. Let's do next steps:
     *  * click "Browse teams" button
     *  * choose country
     *  * choose competition
     *  * choose team
     *  * click "Follow" button
     *  * check this team appear in favorite team section
     */
    @Test
    public void chooseFavoriteClubTest() {
        Following.$followingTeamBrowseButton.click();

        SuggestList.$title.shouldBe(Condition.visible);
        swipe(80, 40);
        SuggestList.$list.findBy(Condition.text("Germany")).click();

        SuggestList.$subTitle.shouldHave(Condition.text("Competitions"));
        SuggestList.$list.findBy(Condition.text("Bundesliga")).click();

        SuggestList.$subTitle.shouldHave(Condition.text("Teams"));
        SuggestList.$list.findBy(Condition.text("Borussia Dortmund")).click();

        Team.$teamName.shouldHave(Condition.text("Borussia Dortmund"));
        Team.$followButton.click();

        BottomPush.$title.shouldBe(Condition.visible);
        BottomPush.$doneButton.click();

        Team.$followButton.shouldHave(Condition.text("FOLLOWING"));
        Team.$backButton.click();

        Following.$followingTeam.shouldHave(Condition.text("Borussia Dortmund"));
    }

    /**
     * Check choosing favorite league. Let's do next steps:
     *  * click "Browse teams" button
     *  * choose country
     *  * choose competition
     *  * click "star" button
     *  * check this competition appear in favorite competitions section
     */
    @Test
    public void chooseFavoriteCompetitionTest() {
        Following.$competitionsBrowseButton.click();

        SuggestList.$title.shouldBe(Condition.visible).shouldBe(Condition.text("All Competitions"));
        swipe(80, 40);
        SuggestList.$list.findBy(Condition.text("England")).click();

        SuggestList.$subTitle.shouldHave(Condition.text("Competitions"));
        SuggestList.$list.findBy(Condition.text("Premier League")).click();

        Competition.$competitionName.shouldHave(Condition.text("Premier League"));
        Competition.$followButton.click();
        Competition.$backButton.click();

        Following.$followingCompetition.shouldHave(Condition.text("Premier League"));
    }

    /**
     * Check keeping favorite team if we try to remove team, but click "Keep" button instead of "Remove".
     * Let's do next steps:
     *  * click "Edit" button
     *  * click "Remove favorite team"
     *  * click "KEEP" button
     *  * check favorite team is "Germany"
     */
    @Test
    public void cancelRemovingFavoriteTeamTest() {
        Following.$editButton.click();
        Following.$removeFavoriteTeamButton.click();

        BottomRemove.$title.shouldHave(Condition.text("Remove your favourite team?"));
        BottomRemove.$keepButton.click();

        Following.$doneButton.click();
        Following.$favoriteTeamText.shouldHave(Condition.text("Germany"));
    }

    /**
     * In this method after each test we close webDriver.
     */
    @After
    public void close() {
        WebDriverRunner.closeWebDriver();
    }
}
