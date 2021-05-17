package barclays.co.uk.pages;

import barclays.co.uk.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="surnameMem")
    public WebElement lastNameInput;

    @FindBy(id="membership0")
    public WebElement membershipNumberInput;

    @FindBy(css="#continue")
    public WebElement continueButton;

    @FindBy(css="#globalErrorAlert h3")
    public WebElement errorMessage;

    public void login(String lastName, String membershipNumber) {
        lastNameInput.sendKeys(lastName);
        membershipNumberInput.sendKeys(membershipNumber);

        try {
            continueButton.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
            executor.executeScript("arguments[0].click();", continueButton);
        }

    }
}
