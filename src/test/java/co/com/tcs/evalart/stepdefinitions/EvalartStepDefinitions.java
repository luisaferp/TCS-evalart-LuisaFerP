package co.com.tcs.evalart.stepdefinitions;

import co.com.tcs.evalart.model.TablaExamples;
import co.com.tcs.evalart.tasks.AbrirPaginaTask;
import co.com.tcs.evalart.tasks.IniciarTask;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

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
    public void resuelveCadaIncognitaPropuesta() {
    }

    @Then("Verifica el codigo Hash")
    public void verificaElCodigoHash() {
    }
}
