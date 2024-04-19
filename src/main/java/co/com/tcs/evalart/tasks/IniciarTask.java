package co.com.tcs.evalart.tasks;

import co.com.tcs.evalart.model.TablaExamples;
import co.com.tcs.evalart.userinterfaces.SesionEvalartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import javax.management.loading.ClassLoaderRepository;

public class IniciarTask implements Task {
    private TablaExamples tablaExamples;

    public IniciarTask(TablaExamples tablaExamples) {
        this.tablaExamples = tablaExamples;
    }

    public static IniciarTask  sesion(TablaExamples tablaExamples) {
        return Tasks.instrumented(IniciarTask.class, tablaExamples);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaExamples.getUsuario()).into(SesionEvalartPage.TXT_USUARIO),
                Enter.theValue(tablaExamples.getContrasena()).into(SesionEvalartPage.TXT_CONTRASENA),
                Click.on(SesionEvalartPage.BTN_LOGIN)
        );
    }
}
