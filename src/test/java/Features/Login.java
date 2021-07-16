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



        public void miLogin (WebDriver driver)  throws Exception
        {
            //SE DA CLIC EN EL BOTON SING IN
            Thread.sleep(2000);
            Utils.ClickButton(elementsLogin.ButtonSignin(driver));
            Thread.sleep(2000);

            //SE REALIZA DESPLAZAMIENTO HACIA LA PARTE INFERIOR
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy (0,350)");
            Thread.sleep(2000);
            Utils.loading(driver, 4000);

            //SE DA CLIC Y SE LLENA EL INPUT USER
            Utils.ClickButton(elementsLogin.InputUser(driver));
            Utils.limpiarYLlenarInput(elementsLogin.InputUser(driver), Config.user);
            Thread.sleep(2000);

            //SE DA CLIC Y SE LLENA EL INPUT PASSWORD
            WebElement inputPassword = driver.findElement(By.id("passwd"));
            inputPassword.click();
            inputPassword.clear();
            inputPassword.sendKeys("test1234");
            Thread.sleep(2000);

            //SE DA CLIC EN EL BOTON SIGIN
            WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
            buttonSignIn.click();
            Thread.sleep(2000);
        }

        public void cerrarSesion (WebDriver driver)
        {
            //******NOTA DE ESTUDIO******

            /*EN CADA CLASE DE FEATURES PODEMOS
            COLOCAR MULTIPLES FUNCIONALIDADES. ES INDISPENSABLE
            CONTAR PRIMERO CON LOS ELEMENTOS WEB. POR EJEMPLO: DENTRO DE
            ESTE METODO PODEMOS DESARROLLAR EL PASO A PASO DE
            CERRAR SESION.

             */

        }

        public void olvidarContraseña (WebDriver driver)
        {

        }

        public void loginIncorrecto (WebDriver driver)
        {

        }



}
