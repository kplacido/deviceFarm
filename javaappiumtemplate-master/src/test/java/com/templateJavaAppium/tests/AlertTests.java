package com.templateJavaAppium.tests;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.AlertsPage;
import com.templateJavaAppium.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends TestBase {

    MainPage mainpage;
    AlertsPage alertspage;

    @Test
    public void validarAlert() {
        mainpage = new MainPage();
        alertspage = new AlertsPage();

        String mensagem = "This is the alert message";

        mainpage.clicarMenuAlerts();
        alertspage.clicarBotaoAlert();

        String mensagemRetornada = alertspage.retornarMensagemAlert();
        alertspage.confirmarAlert();

        Assert.assertEquals(mensagemRetornada,mensagem);

    }
}
