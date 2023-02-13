package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

     @FindBy(xpath="//button[normalize-space()='Continue']")
    WebElement nextStepButton;
    @FindBy(xpath="//input[@id='response-0']")
    WebElement yes;

  @FindBy(xpath="//input[@id='response-1']")
    WebElement no;

    public void selectImmigrationStatus1(){clickOnElement(nextStepButton);}
    public void immigrationstatus(){clickOnElement(yes);}

}
/*nextStepButton, yes, no locators and create methods 'void
        selectImmigrationStatus(String status)'*/