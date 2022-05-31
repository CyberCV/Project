package utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.*;


import utils.CommonMethods;

public class PageInitializers {


    public static LoginPage login;
    public static EmployeeSearchPage employeeSearch;;
    public static AddEmployeePage addEmployee;
    public static DashboardPage dash;
    public static PersonalDetailsPage personal;
    public static AddEmpWorkExperiencePage experience;
    public static ChangeEmployeeContactDetailsPage contactDetails;
    public static DifferentSkillsPage different;
    public static ViewMembershipsPage viewMemberships;
    public static AdminMembershipPage adminMembership;
    public static AddLanguagesPage addLanguages;
    public static AddDependentPage dependent;
    public static QualificationsPage qualifications;
    public static AddingNewLanguagesPage addingNewLanguages;
    public static AddingEmergencyContactsPage addingEmergencyContacts;
    public static JobPage job;
    public static LicensePage license;
    public static AddEmployeeJobDetailsPage addEmployeeJobDetails;

    public static void initializePageObjects(){
        login = new LoginPage();
        employeeSearch = new EmployeeSearchPage();
        addEmployee = new AddEmployeePage();
        dash = new DashboardPage();
        personal = new PersonalDetailsPage();
        experience =new AddEmpWorkExperiencePage();
        contactDetails = new ChangeEmployeeContactDetailsPage();
        different=new DifferentSkillsPage();
        viewMemberships = new ViewMembershipsPage();
        adminMembership = new AdminMembershipPage();
        addLanguages=new AddLanguagesPage();
        dependent =new AddDependentPage();
        qualifications = new QualificationsPage();
        addingNewLanguages = new AddingNewLanguagesPage();
        addingEmergencyContacts = new AddingEmergencyContactsPage();
        job = new JobPage();
        license=new LicensePage();
        addEmployeeJobDetails = new AddEmployeeJobDetailsPage();


    }


}