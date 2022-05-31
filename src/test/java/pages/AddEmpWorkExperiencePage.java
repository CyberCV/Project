package pages;


import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import utils.CommonMethods;

import java.util.List;


public class AddEmpWorkExperiencePage extends CommonMethods {
    @FindBy (xpath = "//*[@id=\"sidenav\"]/li[10]/a")
    public WebElement qualificationTab;
    @FindBy (id = "addWorkExperience")
    public WebElement addButton;
    @FindBy (id = "experience_employer")
    public WebElement companyName;

    @FindBy (id = "experience_jobtitle")
    public WebElement jobTitle;



    @FindBy (id = "experience_from_date")
    public WebElement fromDate;
    @FindBy (xpath = "//*[@id=\"frmWorkExperience\"]/fieldset/ol/li[3]/img")
    public WebElement fromCalender;
    @FindBy (xpath = "//select[@class='ui-datepicker-month']")
    public WebElement fromMonthDropDown;
    @FindBy (xpath = "//select[@class='ui-datepicker-year']")
    public WebElement fromYearDropDown;
    @FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")
    public List<WebElement> fromDay;
    //


    @FindBy (xpath = "//*[@id=\"frmWorkExperience\"]/fieldset/ol/li[4]/img")
    public WebElement toCalender;
    @FindBy (xpath = "//select[@class='ui-datepicker-month']")
    public WebElement toMonthDropDown;
    @FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement toYearDropDown;
    @FindBy (xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td")
    public List<WebElement> toDay;

    @FindBy (id = "experience_comments")
    public WebElement commentsText;

    @FindBy (id = "btnWorkExpSave")
    public WebElement expSaveButton;

    public AddEmpWorkExperiencePage(){
        PageFactory.initElements(driver,this);
    }
}
