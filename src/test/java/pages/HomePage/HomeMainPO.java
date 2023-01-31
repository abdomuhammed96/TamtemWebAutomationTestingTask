package pages.HomePage;

import base.WebPageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMainPO extends WebPageObjectBase {
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/app-header[1]/div[1]/div[1]/div[3]/div[1]/div[1]")
    public WebElement RegistrationButton;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/app-header[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
    public WebElement GamesTab;


   @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/app-game-list[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
   public WebElement VIPTarneeb;










}
