package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddEmployeeJobDetailsPage extends CommonMethods {

   @FindBy(id="btnSave")
   public WebElement editButton;

   @FindBy(id="job_job_title")
   public WebElement jobTitleDD;

   @FindBy(id="job_emp_status")
   public WebElement empStatusDD;

   @FindBy(id="job_eeo_category")
   public WebElement joinedDateDD;

   @FindBy(id="job_sub_unit")
   public WebElement eubUnitDD;

   @FindBy(id="job_location")
   public WebElement locationDD;

   @FindBy(xpath="//*[@class='ui-datepicker-month']")
   public WebElement calMonthDD;

   @FindBy(xpath="//*[@class='ui-datepicker-year']")
   public WebElement calYearDD;

   @FindBy(xpath="//*[@class='ui-datepicker-calendar']/tbody/tr/td")
   public List<WebElement> calDates;

   @FindBy(id="job_contract_start_date")
   public WebElement jobEndDD;

   @FindBy(id="btnSave")
   public WebElement SaveBtn;




    public AddEmployeeJobDetailsPage(){
        PageFactory.initElements(driver,this);
    }

}
