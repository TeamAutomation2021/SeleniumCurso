package Common;


;
import Features.Login;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class BaseTest
{
    //***********INSTANCIAS************
    public static WebDriver driver = null;
    Login login = new Login();


    @Before
    public void Login () throws Exception

    {
        //CREAR DRIVER
        driver = Config.navegadorFireFox();

        //MAXIMIZA VENTANA
        driver.manage().window().maximize();

        //LA FUNCION "driver.get", NOS SIRVE PARA MANDAR LA URL AL NAVEGADOR
        driver.get(Config.URL_QA);

        //POR MEDIO DEL OBJETO "login", MANDAMOS TRAER (INSTANCIAMOS) EL PROCESO DE INICIAR SESION
        login.miLogin(driver);

    }

    @After
    public void tearDown()
    {

        //LA FUNCION "driver.quit", NOS SIRVE PARA CERRAR EL NAVEGADOR
        driver.quit();

    }

}
