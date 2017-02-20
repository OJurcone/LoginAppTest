package com.orlando.webdriver;

import org.junit.Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginAppTest {

    //Webdriver global variable
    WebDriver driver = new FirefoxDriver();

    //This method is used to complete username and password and to submit details.
    //It will return the current url
    public String enterLoginData(String username, String password) throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/login");
        WebElement userelement = driver.findElement(By.id("username"));
        WebElement passwordelement = driver.findElement(By.id("password"));
        WebElement buttonlogin = driver.findElement(By.className("radius"));
        userelement.sendKeys(username);
        passwordelement.sendKeys(password);
        buttonlogin.click();
        Thread.sleep(2000);
        return driver.getCurrentUrl();
    }

    //This method will return the error message related to wrong credentials
    public String checkCredentials() {

        String errorText = driver.findElement(By.id("flash")).getText();
        return errorText;
    }

    //This method will press Logout button from Logout Page
    //It will return the url from the redirected Page
    public String logout() throws InterruptedException {
        WebElement buttonlogout = driver.findElement(By.className("icon-signout"));
        buttonlogout.click();
        Thread.sleep(2000);
        return driver.getCurrentUrl();
    }

    @Test
    //This test will enter the correct credentials, press Login button and will check if the redirect url is correct
    public void shouldSucceedLogin() throws InterruptedException {

        String redirecturl = enterLoginData("tomsmith", "SuperSecretPassword!");
        assertThat((redirecturl), equalTo("http://the-internet.herokuapp.com/secure"));
        driver.quit();


    }

    @Test
    //This test will check if an error is displayed if Username is incorrect
    public void shouldFailUsernameLogin() throws InterruptedException {
        String redirecturl = enterLoginData("WrongUsername", "SuperSecretPassword!");
        assertThat((redirecturl), equalTo("http://the-internet.herokuapp.com/login"));
        Thread.sleep(2000);
        assertThat(checkCredentials(), equalTo("Your username is invalid!\n×"));
        driver.quit();
    }

    @Test
    //This test will check if an error is displayed if Password is incorrect
    public void shouldFailPasswordLogin() throws InterruptedException {
        String redirecturl = enterLoginData("tomsmith", "WrongPassword!");
        assertThat((redirecturl), equalTo("http://the-internet.herokuapp.com/login"));
        Thread.sleep(2000);
        assertThat(checkCredentials(), equalTo("Your password is invalid!\n×"));
        driver.quit();
    }

    @Test
    //This test will check if an error is displayed if Username is incorrect
    public void shouldFailCredentialsLogin() throws InterruptedException {
        String redirecturl = enterLoginData("WrongUsername", "WrongPassword?");
        assertThat((redirecturl), equalTo("http://the-internet.herokuapp.com/login"));
        Thread.sleep(2000);
        assertThat(checkCredentials(), equalTo("Your username is invalid!\n×"));
        driver.quit();
    }

    @Test
    //This test will Login with right credentials and then Logout
    //Will check if the redirected url is correct
    public void shouldSucceedLogout() throws InterruptedException {
        String redirecturl = enterLoginData("tomsmith", "SuperSecretPassword!");
        assertThat((redirecturl), equalTo("http://the-internet.herokuapp.com/secure"));
        String redirecturl2 = logout();
        assertThat((redirecturl2), equalTo("http://the-internet.herokuapp.com/login"));
        driver.quit();
    }

    @Test
    //This test will check that error appears if Login without any Data
    public void shouldFailEmtpyData() throws InterruptedException{
        String redirecturl = enterLoginData("", "");
        assertThat((redirecturl), equalTo("http://the-internet.herokuapp.com/login"));
        Thread.sleep(2000);
        assertThat(checkCredentials(), equalTo("Your username is invalid!\n×"));
        driver.quit();
    }

}