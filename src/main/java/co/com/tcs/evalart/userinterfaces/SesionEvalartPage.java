package co.com.tcs.evalart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SesionEvalartPage {
    public static final Target TXT_USUARIO = Target.the("Campo Usuario").located(By.xpath("//input[@name='username']"));
    public static final Target TXT_CONTRASENA = Target.the("Campo contraseña").located(By.xpath("//input[@name='password']")) ;
    public static final Target BTN_LOGIN = Target.the("BTN LOGIN").located(By.xpath("//button[contains(text(),'Enviar')]")) ;

}
