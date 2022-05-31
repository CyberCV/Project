package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;



public class AddingNewLanguagesPage extends CommonMethods {
        @FindBy(xpath = "//b[text()='Admin']")
        public WebElement adminOption;

        @FindBy(id = "menu_admin_Qualifications")
        public WebElement qualificationOption;

        @FindBy(id = "menu_admin_viewLanguages")
        public WebElement languageOption;

        @FindBy(id = "btnAdd")
        public WebElement addButton;

        @FindBy(id = "language_name")
        public WebElement textBox;

        @FindBy(id = "btnSave")
        public WebElement saveButton;



        public AddingNewLanguagesPage(){
            PageFactory.initElements(driver,this);
        }
    }

