package co.com.tcs.evalart.questions;

import co.com.tcs.evalart.userinterfaces.EvalartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {
    public static Verificar hash() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(EvalartHomePage.LABEL_RESULTADO_HASH).answeredBy(actor);
    }
}
