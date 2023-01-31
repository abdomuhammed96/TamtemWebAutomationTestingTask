package pages.RegistrationPage;

import base.WebPageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPagePO extends WebPageObjectBase {

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/app-signup-tabs[1]/div[1]/div[2]/mat-tab-nav-panel[1]/app-phone[1]/div[1]/form[1]/div[1]/ngx-intl-tel-input[1]/div[1]/input[1]")
    public WebElement MobileNumber;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/app-signup-tabs[1]/div[1]/div[2]/mat-tab-nav-panel[1]/app-phone[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]")
    public WebElement Password;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/app-signup-tabs[1]/div[1]/div[2]/mat-tab-nav-panel[1]/app-phone[1]/div[1]/form[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    public WebElement FullName;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/app-signup-tabs[1]/div[1]/div[2]/mat-tab-nav-panel[1]/app-phone[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    public WebElement Email;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/app-signup-tabs[1]/div[1]/div[2]/mat-tab-nav-panel[1]/app-phone[1]/div[1]/form[1]/div[5]/mat-checkbox[1]/label[1]/span[1]")
    public WebElement NotificationCheckBox;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/app-signup-tabs[1]/div[1]/div[2]/mat-tab-nav-panel[1]/app-phone[1]/div[1]/form[1]/div[7]/button[1]/span[1]")
    public WebElement RegisterButton;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/app-signup-tabs[1]/div[1]/div[2]/mat-tab-nav-panel[1]/app-phone[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]/button[1]/span[1]/div[1]")
public WebElement ShowPassword;


















}
