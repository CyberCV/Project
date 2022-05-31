package steps;

import io.cucumber.java.en.Then;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {
   @Then("user clicks on PIM option")
   public void user_clicks_on_pim_option(){
       click(employeeSearch.pimOption);
    }

    @Then("user click on add employee option")
    public void user_click_on_add_employee_option(){
       click(employeeSearch.addEmployee);
    }


}
