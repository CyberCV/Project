package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddingEmergencyContactsPage extends CommonMethods {
    @FindBy(xpath =" //*[@id=\"sidenav\"]/li[3]/a\")")
    public WebElement sidenavAddEmergencyContact;



    @FindBy(xpath =" btnAddContact")
    public WebElement AddContact;

    @FindBy(xpath =" emgcontacts_name")
    public WebElement emgcontactName;

    @FindBy(id= "emgcontacts_relationship")
    public WebElement relation;


    @FindBy(id= "emgcontacts_homePhone")
    public WebElement emgHomePhone;

    @FindBy(id=  "emgcontacts_mobilePhone")
    public WebElement emgMobilePhone;


    @FindBy(id=  "emgcontacts_workPhone")
    public WebElement emgWorkPhone;

    @FindBy(id=  "btnSaveEContact")
    public WebElement saveBtn;

    @FindBy(xpath = "//*[@id='emgcontact_list']/tbody/tr[1]/td[2]")
    public WebElement editEmployee;

   public AddingEmergencyContactsPage(){
        PageFactory.initElements(driver,this);
    }
}
