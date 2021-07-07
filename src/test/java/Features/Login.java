package Features;

import Common.Config;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login
{
        //**********INSTANCIAS*********
        ElementsLogin elementsLogin = new ElementsLogin();
        SeleniumUtils Utils = new SeleniumUtils();
       Config config = new Config();

        public void miLogin (WebDriver driver)  throws InterruptedException
        {

            //SE DA CLIC EN EL BOTON SING IN
            Thread.sleep(2000);
             Utils.ClickButton(elementsLogin.ButtonSignin(driver));
            Thread.sleep(2000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy (0,350)");
            Thread.sleep(2000);


            Utils.ClickButton(elementsLogin.InputUser(driver));
            Utils.limpiarYLlenarInput(elementsLogin.InputUser(driver), Config.user);

            Thread.sleep(2000);

            WebElement inputPassword = driver.findElement(By.id("passwd"));
            inputPassword.click();
            inputPassword.clear();
            inputPassword.sendKeys("test1234");
            Thread.sleep(2000);

            WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
            buttonSignIn.click();
            Thread.sleep(2000);
        }



}
