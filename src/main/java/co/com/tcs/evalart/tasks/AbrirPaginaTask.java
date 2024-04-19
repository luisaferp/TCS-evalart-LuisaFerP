package co.com.tcs.evalart.tasks;

import co.com.tcs.evalart.userinterfaces.Evalartpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaTask implements Task {
    private Evalartpage evalartPage;
    public static AbrirPaginaTask evalart() {
        return Tasks.instrumented(AbrirPaginaTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(evalartPage),
                Browser.maximize());

    }
}
