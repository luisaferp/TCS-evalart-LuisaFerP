package co.com.tcs.evalart.stepdefinitions;

import co.com.tcs.evalart.model.TablaExamples;
import co.com.tcs.evalart.questions.Verificar;
import co.com.tcs.evalart.tasks.AbrirPaginaTask;
import co.com.tcs.evalart.tasks.IniciarTask;
import co.com.tcs.evalart.tasks.ResolverTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class EvalartStepDefinitions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());}
    @Given("que Luisa ingresa a Evalart")
    public void queLuisaIngresaAEvalart() {
        OnStage.theActorCalled("luisa").wasAbleTo(AbrirPaginaTask.evalart());
    }

    @When("Inicia Sesion con las credenciales")
    public void iniciaSesionConLasCredenciales(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarTask.sesion(TablaExamples.setDatos(dataTable).get(0)));
    }

    @And("Resuelve cada incognita propuesta")
    public void resuelveCadaIncognitaPropuesta(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(ResolverTask.escenarios(TablaExamples.setDatos(dataTable).get(0)));
    }

    @Then("Verifica el codigo Hash")
    public void verificaElCodigoHash(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.hash(), Matchers.equalTo(TablaExamples.setDatos(dataTable).get(0).getHash())));
    }
}
