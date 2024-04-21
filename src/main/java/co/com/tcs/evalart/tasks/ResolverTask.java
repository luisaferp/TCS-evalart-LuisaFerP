package co.com.tcs.evalart.tasks;

import co.com.tcs.evalart.interactions.Espera;
import co.com.tcs.evalart.model.TablaExamples;
import co.com.tcs.evalart.userinterfaces.EvalartHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ResolverTask implements Task {
    private TablaExamples tablaExamples;

    public ResolverTask(TablaExamples tablaExamples) {
        this.tablaExamples = tablaExamples;
    }

    public static ResolverTask escenarios(TablaExamples tablaExamples) {
        return Tasks.instrumented(ResolverTask.class, tablaExamples);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaExamples.getImagen1()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha1()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1),
                Enter.theValue(tablaExamples.getImagen2()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha2()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1),
                Enter.theValue(tablaExamples.getImagen3()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha3()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1),
                Enter.theValue(tablaExamples.getImagen4()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha4()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1),
                Enter.theValue(tablaExamples.getImagen5()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha5()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1),
                Enter.theValue(tablaExamples.getImagen6()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha6()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1),
                Enter.theValue(tablaExamples.getImagen7()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha7()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1),
                Enter.theValue(tablaExamples.getImagen8()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha8()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1),
                Enter.theValue(tablaExamples.getImagen9()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha9()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1),
                Enter.theValue(tablaExamples.getImagen10()).into(EvalartHomePage.TXT_IMAGEN_RESPUESTA),
                Enter.theValue(tablaExamples.getFecha10()).into(EvalartHomePage.TXT_FECHA_RESPUESTA),
                Click.on(EvalartHomePage.BTN_ENVIAR_RESPUESTA),
                Espera.esperaSeg(1)
        );
    }
}
