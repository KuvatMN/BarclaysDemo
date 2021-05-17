package barclays.co.uk.pages;

import barclays.co.uk.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//a[contains(text(),'Personal Banking')]")
    public WebElement personalBankingLink;

    @FindBy(xpath = "//a[contains(text(),'Premier Banking')]")
    public WebElement premierBankingLink;

    @FindBy(xpath = "//a[contains(text(),'Business Banking')]")
    public WebElement businessBankingLink;

    @FindBy(xpath = "//a[contains(text(),'Wealth Management')]")
    public WebElement wealthManagementLink;

    @FindBy(xpath = "//a[contains(text(),'Corporate')]")
    public WebElement corporateLink;
}
