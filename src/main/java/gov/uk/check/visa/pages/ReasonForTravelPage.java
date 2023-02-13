package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
    private static final Logger logger = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public  ReasonForTravelPage() {
        PageFactory.initElements(driver,this);}
@CacheLookup
        @FindBy(xpath = "//button[normalize-space()='Continue']")
WebElement nextStepButton;
        @FindBy(xpath = "//input[@id='response-1']")
        WebElement reasonForVisitList;
      //  @FindBy(xpath = "//input[@id='response-0']")
        WebElement Tourism;

        @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']//label[text()='Health and care professional']")
        WebElement WorkVisa;
        @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
        WebElement clickcontinue;
        @FindBy(xpath = "//input[@id='response-4']")
            WebElement familyvisa;


        public void clickVisitList() {
            clickOnElement(reasonForVisitList);
        }

        public void clickNextStepButton () {
            clickOnElement(nextStepButton);
        }
        public void clickOnTourism () {
            clickOnElement(Tourism);
        }
        public void setReasonForVisitList () {
            clickOnElement(WorkVisa);
        }
        public void setClickcontinue () {
            clickOnElement(clickcontinue);
        }
        public void setReasonForVisitList1(){
            clickOnElement(familyvisa);}
    }




    /*- nextStepButton, reasonForVisitList locators and create methods
'void selectReasonForVisit(String reason)'
and 'void clickNextStepButton()'*/
