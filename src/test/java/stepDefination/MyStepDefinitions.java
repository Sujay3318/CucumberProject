package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @io.cucumber.java.en.Given("^open url \"([^\"]*)\"$")
    public void open_url_something(String strArg1) throws Throwable {
        System.out.println("open url");
    }

    @io.cucumber.java.en.When("^enter username as \"([^\"]*)\" password as \"([^\"]*)\"$")
    public void enter_username_as_something_password_as_something(String strArg1, String strArg2) throws Throwable {
       System.out.println("enter username and password");
    }

    @io.cucumber.java.en.Then("^login success message will get displayed$")
    public void login_success_message_will_get_displayed() throws Throwable {
     System.out.println("login sucess message should get displayed");
    }

    @io.cucumber.java.en.And("^click on login$")
    public void click_on_login() throws Throwable {
       System.out.println("click on login");    }

    

}