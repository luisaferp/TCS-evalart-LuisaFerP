package co.com.tcs.evalart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EvalartHomePage {
    public static final Target BTN_ENVIAR_RESPUESTA = Target.the("Enviar Respuestas").located(By.xpath("//button[@type='submit']"));
    public static final Target TXT_IMAGEN_RESPUESTA = Target.the("Campo respuesta imagen").located(By.xpath("//input[@type='submit1']"));
    public static final Target TXT_FECHA_RESPUESTA = Target.the("Campo respuesta fecha").located(By.xpath("//input[@type='submit2']"));
    public static final Target LABEL_RESULTADO_HASH = Target.the("obtenion HASH").located(By.xpath("//p[@class='text-white text-2xl text-center break-all']"));
}
