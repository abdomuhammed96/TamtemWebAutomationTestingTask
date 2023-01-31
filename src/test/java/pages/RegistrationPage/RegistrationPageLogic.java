package pages.RegistrationPage;

import org.openqa.selenium.JavascriptExecutor;

import java.util.Properties;

import static utils.PropertiesLoader.readPropertyFile;

public class RegistrationPageLogic extends RegistrationPageAbstract {

    Properties testData = readPropertyFile("Data/RegistrationData.properties");

    public RegistrationPageLogic() {
        super();
    }


    @Override
    public void Register() throws InterruptedException {
        writeInTextField(MobileNumber, testData.getProperty("MobileNumber"));
        ScrollDown();
        clickOnElement(Password);
        clickOnElement(ShowPassword);
        writeInTextField(Password, testData.getProperty("Password"));
        writeInTextField(Email, testData.getProperty("Email"));
        writeInTextField(FullName, testData.getProperty("FullName"));
        clickOnElement(NotificationCheckBox);
        clickOnElement(RegisterButton);
    }
}

